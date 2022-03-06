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
@RequestMapping("/buy")
public class BuyController {
	@RequestMapping( method = RequestMethod.GET)
	  private String getAllBooks(Model model) {
		  return "BookList";
	  }
	
	@RequestMapping("/1111")
	  public String addBook(Model model) {
		  return "Buy";
	  }

}
