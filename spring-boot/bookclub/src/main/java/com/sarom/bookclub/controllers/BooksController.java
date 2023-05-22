package com.sarom.bookclub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
// HOME PAGE ----------------------------------------------------------------------------------------------
	@GetMapping("") // if left blank this will use the requestmapping at the top of the page
	public String dashboard(@ModelAttribute("book") Book book, HttpSession session, Model viewmodel) {
		if (session.getAttribute("userId") != null) {
			User thisUser = this.uServ.getById((Long) session.getAttribute("userId"));
			viewmodel.addAttribute("currentUser", thisUser);
			viewmodel.addAttribute("books", bServ.allBooks());
			return "books.jsp";
		}

		return "redirect:/";
	}
	
// CREATE PAGE -------------------------------------------------------------------------------------------
	@GetMapping("/new")
	public String newBook(@ModelAttribute("newBook") Book book, BindingResult result, Model viewmodel,
			HttpSession session) {
		User currentUser = uServ.getById((Long) session.getAttribute("userId"));
		viewmodel.addAttribute("user", currentUser);
		return "newBook.jsp";
	}

	@PostMapping("/new")
	public String createBook(@Valid @ModelAttribute("newBook") Book newBook, BindingResult result,
			HttpSession session) {
		if (session.getAttribute("userId") != null) {
			if (result.hasErrors()) {
				return "newBook.jsp";
			}
			newBook.setUser(uServ.getById((long) session.getAttribute("userId")));
			this.bServ.create(newBook);

		}
		return "redirect:/books";

	}
	
// SHOW PAGE -------------------------------------------------------------------------
	@GetMapping("/{bookId}")
	public String showOneBook(@PathVariable("bookId") Long bookId,
			Model viewmodel,
			HttpSession session) {
		User currentUser = uServ.getById((Long) session.getAttribute("userId"));
		viewmodel.addAttribute("book", bServ.getById(bookId));
		viewmodel.addAttribute("currentUser", currentUser);
		// compare the id's of the user in session compared to the user who posted the book
//		if(currentUser != book.getUser().getId()) {
//			
//		}
		return "show.jsp";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteBook(@PathVariable("id") Long id,
			Model viewmodel) {
		viewmodel.addAttribute("book", bServ.getById(id));
		this.bServ.deleteById(id);
		return "redirect:/books";
	}
	
// EDIT PAGE ------------------------------------------------------------------------
	@GetMapping("/edit/{id}")
	public String editBook(@PathVariable("id") Long id,
			Model viewmodel) {
		viewmodel.addAttribute("book", bServ.getById(id));
		return "edit.jsp";
	}
}
