/**
 * 
 */
package com.eden.ElonBookStore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.ElonBookStore.model.entity.Books;
import com.eden.ElonBookStore.model.repository.BookRepository;

/**
 * @author shima
 *
 */

@Service
@Transactional
public class BookService {
	@Autowired
	BookRepository bookRepository;


	// CRUD
	// Creat
	public Books saveBook(Books book) {
		bookRepository.save(book);
		return loadBookById(book.getIsbn());
	}
	// Read
	public List<Books> loadAllBooks(){
		return (List<Books>) bookRepository.findAll();
	}

	public Books loadBookById(String id) {
		return bookRepository.findById(id).get();
	}

	// Update
	public Books updateBook(Books book) {
		return bookRepository.save(book);
	}


	// Delete
	public void deleteBook(String id) {
		bookRepository.deleteById(id);
	}







}
