/**
 * 
 */
package com.eden.ElonBookStore.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eden.ElonBookStore.model.entity.Books;
import com.eden.ElonBookStore.model.entity.Genres;
import com.eden.ElonBookStore.service.BookService;

/**
 * @author shima
 *
 */

@Controller
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@RequestMapping( method = RequestMethod.GET)
	public String getAllBooks(Model model) {
//		List<Books> list = bookService.loadAllBooks();
		
		List<Books> list = new ArrayList<Books>();
		Books book = new Books();
		book.setIsbn("11111");
		book.setTitle("SASUKE");
		book.setPrice(1111); 
		
		String str="2015-03-31";  
		Date d = Date.valueOf(str);
		

		book.setCreated(d);
		book.setUpdated(d);
		list.add(book);


		
		model.addAttribute("allBooks", list);
		return "BookList";
	}

}
