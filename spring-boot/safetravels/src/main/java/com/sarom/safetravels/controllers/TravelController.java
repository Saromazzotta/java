package com.sarom.safetravels.controllers;

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

import com.sarom.safetravels.models.Travel;
import com.sarom.safetravels.services.TravelService;

import jakarta.validation.Valid;

@Controller
public class TravelController {

	@Autowired
	private TravelService travelService; 
	
	@GetMapping("/expenses")
	public String expenses(@ModelAttribute("travels") Travel travel, Model viewmodel) {
		
		List<Travel> allTravels = travelService.allTravels();
		viewmodel.addAttribute("allTravels", allTravels);
		return "expenses.jsp";
	}
	
	// Create
	@PostMapping("/expenses")
	public String createExpense(@Valid @ModelAttribute("travels") Travel travel, BindingResult result, Model viewmodel) {
		if(result.hasErrors()) {
			List<Travel> allTravels = travelService.allTravels();
			viewmodel.addAttribute("allTravels", allTravels);
			return "expenses.jsp";
		} else {
			this.travelService.create(travel);
			return "redirect:/expenses";
		}
	}
	
	// Show Edit Page
	@GetMapping("/expenses/edit/{id}")
	public String editPage(@PathVariable("id") Long id, Travel travel, Model viewmodel) {
		viewmodel.addAttribute("travels", this.travelService.findOne(id));
		return "edit.jsp";
	}
	
	// Show one Page
	@GetMapping("/expenses/{id}")
	public String showOne(@PathVariable("id") Long id, Model viewmodel) {
		viewmodel.addAttribute("travels", this.travelService.findOne(id));
		return "showOne.jsp";
	}
	
	//Update
	@PutMapping("/expenses/update/{id}")
	public String updateExpense(@Valid @ModelAttribute("travels") Travel travel,
			BindingResult result,
			@PathVariable("id") Long id) {
		if(result.hasErrors()) {
			return "edit.jsp";
		} 
		this.travelService.update(travel);
		return "redirect:/expenses";
	}
	
	
	//Delete
	@GetMapping("/expenses/delete/{id}")
	public String deleteExpense(@PathVariable("id")Long id) {
		this.travelService.deleteById(id);
		return "redirect:/expenses";
	}
	
}
