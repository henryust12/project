package com.eden.ElonBookStore.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eden.ElonBookStore.model.dto.Books;

@Repository
public interface BookRepository extends JpaRepository<Books, String> {

}
