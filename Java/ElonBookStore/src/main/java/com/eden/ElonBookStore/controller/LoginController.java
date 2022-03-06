/**
 * 
 */
package com.eden.ElonBookStore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shima
 *
 */

@Controller
@RequestMapping("/") 
public class LoginController {
	
	@GetMapping
	private String login() {
		return "Home";
	}
			
//	@GetMapping("/login?")
//	//?userId=1&pass=2&level=3
//	private String success(@PathVariable String userId, @PathVariable String pass, @PathVariable String level, Model model) {
//		List<String> list = new ArrayList<String>();
//		list.add(userId);
//		list.add(pass);
//		list.add(level);
//		model.addAttribute("lst", list);
//		
//		return "test";
//	}
  
}
