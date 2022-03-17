/**
 * 
 */
package com.eden.ElonBookStore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.ElonBookStore.model.dto.Users;
import com.eden.ElonBookStore.model.repository.UserRepository;

/**
 * @author shima
 *
 */

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	// CRUD
	// select *
//	public List<Users> loadAllUsers(){
//		return (List<Users> ) userRepository.findAll();
//	}
	

	public List<Users> loadAllUsers(){
		return (List<Users> ) userRepository.loadUserLogin();
	}
	// select where
		public Users loadUserkById(String userId) {
			return userRepository.findById(userId).get();
		}
		// insert into
		public Users saveUser(Users user) {
			userRepository.save(user);
			return loadUserkById(user.getUserId());
		}
		// delete
		public void deleteUser(String userId) {
			userRepository.deleteById(userId);
		}
		// update
		public Users updateUser(Users user) {
			return userRepository.save(user);
		}

		
		// Login
//		public Users login(String userId, String password, char userLevel) {
//			return userRepository.loadUserLogin(userId, password, userLevel);
//		}
		public Users getUserLogin(Users user) {
			return loadUserkById(user.getUserId());
		}
}
