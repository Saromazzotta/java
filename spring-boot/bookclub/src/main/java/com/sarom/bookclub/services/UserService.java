package com.sarom.bookclub.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.sarom.bookclub.models.User;
import com.sarom.bookclub.repositories.UserRepo;
import com.sarom.bookclub.validators.LoginUser;

@Service
public class UserService {
	
	@Autowired
	private UserRepo uRepo;
	
	//CREATE USER
	public User create(User newUser) {
		return this.uRepo.save(newUser);
	}
	
	//GET ONE
	public User getById(Long thisId) {
		return this.uRepo.findById(thisId).orElse(null);
	}
	
	//GET ALL
	
	
	//REGISTER
	public User register(User newUser, BindingResult result) {

		// Reject if email is taken (present in database)
		Optional<User> potentialUser = uRepo.findByEmail(newUser.getEmail());
		if(potentialUser.isPresent()) {
			result.rejectValue("email", "Matches", "Email taken, choose another.");
		}
		// Reject if password doesn't match confirmation
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
		    result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
		}
		// Return null if result has errors
		if(result.hasErrors()) {
			return null;
		}
		// Hash and set password, save user to database
		newUser.setPassword(BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt()));
		return this.create(newUser);
	}
	
	//LOGIN
    public User login(LoginUser newLoginObject, BindingResult result) {
    
		// Find user in the DB by email
	    Optional<User> potentialUser = uRepo.findByEmail(newLoginObject.getEmail());
	    // Reject if NOT present
	    if(!potentialUser.isPresent()) {
			result.rejectValue("email", "Matches", "Invalid Credentials."); 
			return null;
		}
	    User thisUser = potentialUser.get();
	    // Reject if BCrypt password match fails
	    if(!BCrypt.checkpw(newLoginObject.getPassword(), thisUser.getPassword())) {
	    	result.rejectValue("email", "Matches", "Invalid Credentials."); //Never tell users whether email or password was correct for security reasons 
	    }
	    // Return null if result has errors
	    if(result.hasErrors()) {
			return null;
		}
	    // Otherwise, return the user object
	    return thisUser; 
	    
	}
    
    
}
