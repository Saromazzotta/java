package com.sarom.bookclub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarom.bookclub.models.Book;
import com.sarom.bookclub.repositories.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bRepo;
	
	// CREATE
	public Book create(Book newBook) {
		return bRepo.save(newBook);
	}
	
	// FIND ALL
	public List<Book> allBooks() {
		return bRepo.findAll();
	}
	
	// FindById
	public Book getById(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}
	
	
	// UPDATE
	public Book update(Book toUpdate) {
		return this.bRepo.save(toUpdate);
	}
	
	// DELETE
	public void deleteById(Long id) {
		this.bRepo.deleteById(id);
	}
}
