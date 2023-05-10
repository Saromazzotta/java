package com.sarom.burgertracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sarom.burgertracker.models.Burger;
import com.sarom.burgertracker.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {

	@Autowired
	private BurgerService burgerService;
	
	@GetMapping("/")
	public String newBurger(@ModelAttribute("burger") Burger burger, Model model) {
		
		List<Burger> allBurgers = burgerService.allBurgers();
		model.addAttribute("allBurgers", allBurgers);
		return "newBurger.jsp";
	}
	
	@PostMapping("/")
	public String create(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Burger> allBurgers = burgerService.allBurgers();
			model.addAttribute("allBurgers", allBurgers);
			return "newBurger.jsp";
		} else {
			burgerService.createBurger(burger);
			return "redirect:/";
		}
	}
}
