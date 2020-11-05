package com.bookserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookserver.model.Book;
import com.bookserver.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
    private BookRepository repository;
	
    @GetMapping("/books")
    List<Book> findAll() {
        return repository.findAll();
    }

}
