package com.sarom.bookclub.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sarom.bookclub.models.Book;

public interface BookRepo extends CrudRepository<Book, Long> {

	List<Book> findAll();
}
