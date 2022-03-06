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
@RequestMapping("/users")
public class UserController {
	@RequestMapping( method = RequestMethod.GET)
	  private String getAllBooks(Model model) {
		  return "UserList";
	  }
	
	@RequestMapping("/add")
	  public String addBook(Model model) {
		  return "UserEntry";
	  }
	  
	  @RequestMapping("/edit")
	  public String editBook(Model model) {
		  return "UserUpdate";
	  }
	  
	  @RequestMapping("/details")
	  public String detailUser(Model model) {
		  return "AccountDetail";
	  }
}
