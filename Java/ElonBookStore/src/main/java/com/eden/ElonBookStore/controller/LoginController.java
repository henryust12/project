/**
 * 
 */
package com.eden.ElonBookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eden.ElonBookStore.model.dto.Users;
import com.eden.ElonBookStore.service.UserService;

/**
 * @author shima
 *
 */
@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping( method = RequestMethod.GET)
	  private String login(Model model) {
		Users user = new Users();
		model.addAttribute("userLogin", user);
		  return "Home";
	  }
	
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String addBookAction(@ModelAttribute("userLogin") Users user) {
		Users userLogin = userService.getUserLogin(user);
		Boolean ck = userLogin.getPassword().equals(user.getPassword());
		if( ck==true ) {
			if(userLogin.getUserLevel() == '1' && user.getUserLevel() == '1') {
				return "redirect:/cashier";
			} else if(userLogin.getUserLevel() == '2' && user.getUserLevel() == '2') {
				return "redirect:/books";
			} else {
				return "redirect:/";
			}
		} else {
			return "redirect:/";
		}
		
	}
	
}
