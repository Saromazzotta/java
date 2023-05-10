package com.sarom.burgertracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sarom.burgertracker.models.Burger;
import com.sarom.burgertracker.repositories.BurgerRepository;

@Service
public class BurgerService {
	// adds the burger repository as a dependency
	private final BurgerRepository burgerRepository;
	
	public BurgerService(BurgerRepository burgerRepository) {
		this.burgerRepository = burgerRepository;
	}
	
	// FIND ALL 
	public List<Burger> allBurgers() {
		return burgerRepository.findAll();
	}
	
	// CREATE ONE
	public Burger createBurger(Burger newBurger) {
		return burgerRepository.save(newBurger);
	}
	
	//FIND ONE
	public Burger findBurger(Long id) {
		Optional<Burger> optionBurger = burgerRepository.findById(id);
		if(optionBurger.isPresent()) {
			return optionBurger.get();
		} else {
			return null;
		}
	}

}
