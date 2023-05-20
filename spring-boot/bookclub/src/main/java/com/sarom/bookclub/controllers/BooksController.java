package com.sarom.bookclub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sarom.bookclub.models.Book;
import com.sarom.bookclub.models.User;
import com.sarom.bookclub.services.BookService;
import com.sarom.bookclub.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
@Controller
@RequestMapping("/books")
public class BooksController {

	@Autowired
	private UserService uServ;
	
	@Autowired
	private BookService bServ;
	
	
	@GetMapping("") //if left blank this will use the requestmapping at the top of the page
	public String dashboard(@ModelAttribute("books")Book book, HttpSession session, Model viewmodel) {
		if(session.getAttribute("userId") != null) {
			User thisUser = this.uServ.getById((Long) session.getAttribute("userId"));
			viewmodel.addAttribute("currentUser", thisUser);
			viewmodel.addAttribute("user", uServ.());
			return "books.jsp";
		}
			
		return "redirect:/";
	}
	
	@GetMapping("/new") 
	public String newBook(@ModelAttribute("books")Book book, BindingResult result, Model viewmodel) {
//		viewmodel.addAttribute("books", books);
		return "newBook.jsp";
	}
	
	@PostMapping("/new")
	public String create(@Valid @ModelAttribute("books") Book book,
			BindingResult result) {
		if(result.hasErrors()) {
			return "newBook.jsp";
		}else {
			this.bServ.create(book);
			return "redirect:/books";
		}
	}
}
