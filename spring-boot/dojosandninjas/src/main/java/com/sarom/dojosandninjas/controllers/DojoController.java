package com.sarom.dojosandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sarom.dojosandninjas.models.Dojo;
import com.sarom.dojosandninjas.services.DojoService;
import com.sarom.dojosandninjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class DojoController {

	@Autowired 
	private DojoService dojoService;
	
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo")Dojo dojo, Model viewmodel) {
		viewmodel.addAttribute("dojos", dojoService.allDojos());
		return "dojonew.jsp";
	}
	
	// CREATE
	@PostMapping("/dojos/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "dojonew.jsp";
		} else {
			this.dojoService.create(dojo);
			return "redirect:/dojos/new";
		}
		
	}
	
	@GetMapping("/dojos/{dojoId}")
	public String Show(@PathVariable("dojoId")Long id, Model viewmodel) {
		viewmodel.addAttribute("dojo", dojoService.findDojo(id)); //using the one to many relationship already established to access the ninjas through the dojo
		return "show.jsp";
	}
	
	
	
}
