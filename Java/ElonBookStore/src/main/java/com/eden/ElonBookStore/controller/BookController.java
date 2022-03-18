/**
 * 
 */
package com.eden.ElonBookStore.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eden.ElonBookStore.model.dto.Books;
import com.eden.ElonBookStore.service.BookService;

/**
 * @author shima
 *
 */

@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping( method = RequestMethod.GET)
	private String getAllBooks(Model model) {
		List<Books> list = bookService.loadAllBooks();
		model.addAttribute("allBooks", list);
		return "BookList";
	}
	
	//検索
	@RequestMapping("/search")
	public String searchBook(Model model) {
		List<Books> list = bookService.loadAllBooks();
		model.addAttribute("allBooks", list);
		return "BookList";
	}
	@RequestMapping("/search/isbn")
	public String searchBookIsbn(Model model) {
		List<Books> list = bookService.loadAllBooks();
		model.addAttribute("allBooks", list);
		return "BookList";
	}
	@RequestMapping("/search/title")
	public String searchBookTitle(Model model) {
		List<Books> list = bookService.loadAllBooks();
		model.addAttribute("allBooks", list);
		return "BookList";
	}
	
	
	@RequestMapping("/search/isbn/{isbn}")
	public String searchBookByIsbn(@PathVariable("isbn") String isbn, Model model) {
		try {
			Books book = bookService.loadBookById(isbn);
			List<Books> list = new ArrayList<Books>();
			list.add(book);
			model.addAttribute("allBooks", list);
			return "BookList";
		} catch (Exception e) {
			return "Error";
		}
	}
	
	@RequestMapping("/search/title/{title}")
	public String searchBookByTitle(@PathVariable("title") String title, Model model) {
		try {
			List<Books> list = bookService.searchByTitle(title);	
			if(list.size()==0) {
				return "Error";
			}
			model.addAttribute("allBooks", list);
			return "BookList";
		} catch (Exception e) {
			return "Error";
		}
	}
	
	
	@RequestMapping("/add")
	public String addBook(Model model) {
		Books book = new Books();

		model.addAttribute("book", book);
		return "BookEntry";
	}
	
	@RequestMapping(path = "/addAction", method = RequestMethod.POST)
	public String addBookAction(@ModelAttribute("book") Books book) {
		bookService.saveBook(book);
		return "redirect:/books";
	}

	@RequestMapping("/edit/{isbn}")
	public String editBook(@PathVariable("isbn") String isbn, Model model) {
		Books book = bookService.loadBookById(isbn);
		model.addAttribute("book", book);
		return "BookUpdate";
	}
	@RequestMapping("/editAction/{isbn}")
	private String editBookAction(@PathVariable("isbn") String isbn, @ModelAttribute Books book) {
        book.setIsbn(isbn);
        bookService.updateBook(book);
        return "redirect:/books";
    }
	
	

	@GetMapping("/delete/{isbn}")
	public String deleteBook(@PathVariable("isbn") String isbn) {
		bookService.deleteBook(isbn);
		return "redirect:/books";
	}



}
