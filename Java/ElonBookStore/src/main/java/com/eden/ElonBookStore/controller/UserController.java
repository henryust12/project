/**
 * 
 */
package com.eden.ElonBookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eden.ElonBookStore.model.dto.Users;
import com.eden.ElonBookStore.service.UserService;

/**
 * @author shima
 *
 */

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	
	@RequestMapping( method = RequestMethod.GET)
	  private String getAllUsers(Model model) {
		List<Users> list = userService.loadAllUsers();
		model.addAttribute("allUsers", list);
		  return "UserList";
	  }
	
	@RequestMapping("/add")
	  public String addUser(Model model) {
		Users user = new Users();
		model.addAttribute("user", user);
		  return "UserEntry";
	  }
	
	@RequestMapping(path = "/addAction", method = RequestMethod.POST)
	public String addUserAction(@ModelAttribute("user") Users user) {
		userService.saveUser(user);
		return "redirect:/users";
	}
	  
	  @RequestMapping("/edit/{userId}")
	  public String editUser(@PathVariable("userId") String userId, Model model) {
		  Users user = userService.loadUserkById(userId);
		  model.addAttribute("user", user);
		  return "UserUpdate";
	  }
	  @RequestMapping("/editAction/{userId}")
		private String editBookAction(@PathVariable("userId") String userId, @ModelAttribute Users user) {
	        user.setUserId(userId);
	        userService.updateUser(user);
	        return "redirect:/users";
	    }
	  
	  @GetMapping("/delete/{userId}")
		public String deleteBook(@PathVariable("userId") String userId) {
			userService.deleteUser(userId);
			return "redirect:/users";
		}
	  
	  @RequestMapping("/details")
	  public String detailUser(Model model) {
		  return "AccountDetail";
	  }
}
