package com.sarom.booksapi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sarom.booksapi.models.Book;
import com.sarom.booksapi.services.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public String allBooks(Model model) {
		
		List<Book> allBooks = bookService.allBooks();
		model.addAttribute("allBooks", allBooks);
		
		return "index.jsp";
	}
	
	
	
	@GetMapping("/books/{bookId}")
	public String show(Model model, @PathVariable("bookId") Long bookId) {
		
		Book book = bookService.findBook(bookId);
		System.out.println(book);
		model.addAttribute("book", book);
	
		
		return "show.jsp";
	}
}
