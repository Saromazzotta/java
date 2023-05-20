package com.sarom.loginandreg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sarom.loginandreg.models.User;
import com.sarom.loginandreg.services.UserService;
import com.sarom.loginandreg.validators.LoginUser;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/users") //puts users infront of every request mapping for RESTFUL routing
public class UserController {

	@Autowired
	private UserService userServ;

	@GetMapping("") //leave getmapping blank here when using RootRouteRedirect
	public String index(Model model) {

		// Bind empty User and LoginUser objects to the JSP
		// to capture the form input
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "login.jsp";
	}

	//REGISTER POST
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
			HttpSession session) {

		// TO-DO Later -- call a register method in the service
		User thisUser = this.userServ.register(newUser, result);
		if (result.hasErrors()) {
			model.addAttribute("newLogin", new LoginUser());
			return "login.jsp";
		}
		
		// TO-DO Later: Store their ID from the DB in session and redirect 
		session.setAttribute("userId", thisUser.getId());

		return "redirect:/users/dashboard";
	}

	//LOGIN POST
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model,
			HttpSession session) {
		User thisUser = userServ.login(newLogin, result);
		if (result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "login.jsp";
		}
		// TO-DO Later: Store their ID from the DB in session and redirect
		session.setAttribute("userId", thisUser.getId());
		

		return "redirect:/users/dashboard";
	}
	
	//Logout
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
			
		return "dashboard.jsp";
	}
}
