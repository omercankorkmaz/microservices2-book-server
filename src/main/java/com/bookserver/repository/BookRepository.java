package com.bookserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookserver.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}