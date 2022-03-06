package com.eden.ElonBookStore.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEST_USER")
public class TestUser {
	
	

	@Id
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "password")
	private String password;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
 
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	

}
