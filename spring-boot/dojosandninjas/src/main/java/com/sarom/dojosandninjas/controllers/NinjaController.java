package com.sarom.dojosandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sarom.dojosandninjas.models.Ninja;
import com.sarom.dojosandninjas.services.DojoService;
import com.sarom.dojosandninjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class NinjaController {

	@Autowired
	private NinjaService ninjaService;
	
	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model viewmodel) {
		viewmodel.addAttribute("dojos", dojoService.allDojos());
		return "ninjanew.jsp";
	}
	
	// CREATE
	@PostMapping("/ninjas/new")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "ninjanew.jsp";
		}else {
			this.ninjaService.create(ninja);
			return "redirect:/ninjas/new";
		}
	}
}
