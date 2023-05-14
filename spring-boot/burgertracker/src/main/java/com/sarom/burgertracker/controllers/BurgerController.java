package com.sarom.burgertracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

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
	public String createBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Burger> allBurgers = burgerService.allBurgers();
			model.addAttribute("allBurgers", allBurgers);
			return "newBurger.jsp";
		} else {
			this.burgerService.createBurger(burger);
			return "redirect:/";
		}
	}
	
	//EDIT
	@GetMapping("/burgers/edit/{burgerId}") 
		public String editBurger(
				@PathVariable("burgerId") Long burgerId,
				Model viewmodel
				) {
		viewmodel.addAttribute("thisBurger", this.burgerService.findBurger(burgerId));
			return "edit.jsp";
	}
	
	//UPDATE
	@PutMapping("/burgers/update/{id}")  //in edit route always must use {id} or new item will be created in the database
	public String updateBurger(@Valid @ModelAttribute("thisBurger") Burger updatedBurger, 
			BindingResult result,
			@PathVariable("id") Long id) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}
		this.burgerService.updateBurger(updatedBurger);
		return "redirect:/";
	}
	
	//DELETE
	@GetMapping("/burgers/delete/{burgerId}")
	public String deleteBurger(@PathVariable("burgerId") Long burgerId) {
		this.burgerService.deleteById(burgerId);
		return "redirect:/";
	}

}



