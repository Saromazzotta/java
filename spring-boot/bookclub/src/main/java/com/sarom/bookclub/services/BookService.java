package com.sarom.bookclub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarom.bookclub.models.Book;
import com.sarom.bookclub.repositories.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;
	
	// FIND ALL
	public List<Book> allBooks() {
		return bookRepo.findAll();
	}
	
	// CREATE
	public Book create(Book newBook) {
		return bookRepo.save(newBook);
	}
}
