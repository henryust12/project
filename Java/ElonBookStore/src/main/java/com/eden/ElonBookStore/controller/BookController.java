/**
 * 
 */
package com.eden.ElonBookStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author shima
 *
 */

@Controller
@RequestMapping("/books")
public class BookController {
	
	  @RequestMapping( method = RequestMethod.GET)
	  private String getAllBooks(Model model) {
		  return "BookList";
	  }
	  
	  @RequestMapping("/add")
	  public String addBook(Model model) {
		  return "BookEntry";
	  }
	  
	  @RequestMapping("/edit")
	  public String editBook(Model model) {
		  return "BookUpdate";
	  }
	  
	  

}
