/**
 * 
 */
package com.eden.ElonBookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eden.ElonBookStore.model.entity.TestUser;
import com.eden.ElonBookStore.service.TestUserService;

/**
 * @author shima
 *
 */
@Controller
@RequestMapping
public class TestController {
	@Autowired
	TestUserService testUserService;
	
	
//	@PostMapping("/test/{id}")
//	private String welcome(@PathVariable String id, Model model) {
//		String data = id;
//		TestUser testUser = testUserService.loadUserById(id);
//		data=testUser.getPassword();
//		model.addAttribute("user", data);
//		return "test";
//	}
	
	
//	@GetMapping
//	private String viewTest(Model model) {
//		List<TestUser> list = testUserService.loadAllUser();
//		model.addAttribute("testuser", list);
//		return "test";
//	}

}
