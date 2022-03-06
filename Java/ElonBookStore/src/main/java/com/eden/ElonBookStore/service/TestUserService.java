/**
 * 
 */
package com.eden.ElonBookStore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.ElonBookStore.model.repository.TestUserRepository;


import com.eden.ElonBookStore.model.entity.TestUser;
/**
 * @author shima
 *
 */

@Service
@Transactional
public class TestUserService {
	
	@Autowired
	private TestUserRepository testRepository;
	
	public List<TestUser> loadAllUser(){
		return (List<TestUser>) testRepository.findAll();
	}
	
	public TestUser loadUserById(String id) {
		return testRepository.findById(id).get();
	}

}
