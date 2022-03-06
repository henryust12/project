package com.eden.ElonBookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eden.ElonBookStore.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
