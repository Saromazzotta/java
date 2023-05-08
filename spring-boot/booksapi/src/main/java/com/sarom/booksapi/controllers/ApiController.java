package com.sarom.booksapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")

public class ApiController {

	@GetMapping("/all")
	public String allBooks() {
		return "All Books";
	}
	
}
