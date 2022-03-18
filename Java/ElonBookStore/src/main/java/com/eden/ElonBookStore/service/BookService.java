/**
 * 
 */
package com.eden.ElonBookStore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.ElonBookStore.model.dto.Books;
import com.eden.ElonBookStore.model.repository.BookRepository;

/**
 * @author shima
 *
 */
@Service
@Transactional
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
//	CRUD
	// select *
	public List<Books> loadAllBooks(){
		return (List<Books>) bookRepository.findAll();
	}
	// select where
	public Books loadBookById(String isbn) {
		return bookRepository.findById(isbn).get();
	}
	// insert into
	public Books saveBook(Books book) {
		bookRepository.save(book);
		return loadBookById(book.getIsbn());
	}
	// delete
	public void deleteBook(String isbn) {
		bookRepository.deleteById(isbn);
	}
	// update
		public Books updateBook(Books book) {
			return bookRepository.save(book);
		}
		
	// search by title
	public List<Books> searchByTitle(String title) {
		return bookRepository.findByTitle(title);
	}
		

}
