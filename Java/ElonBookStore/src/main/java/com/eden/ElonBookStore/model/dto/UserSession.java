/**
 * 
 */
package com.eden.ElonBookStore.model.dto;

/**
 * @author shima
 *
 */
public class UserSession {
	/**
	 * @param userId
	 * @param password
	 * @param userLevel
	 */
	public UserSession(String userId, String password, String userLevel) {
		super();
		this.userId = userId;
		this.password = password;
		this.userLevel = userLevel;
	}
	/**
	 * 
	 */
	public UserSession() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String userId;
	private String password;
	private String userLevel;
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
	/**
	 * @return the userLevel
	 */
	public String getUserLevel() {
		return userLevel;
	}
	/**
	 * @param userLevel the userLevel to set
	 */
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
	@Override
	public String toString() {
		return "UserSession [userId=" + userId + ", password=" + password + ", userLevel=" + userLevel
				+ ", getUserId()=" + getUserId() + ", getPassword()=" + getPassword() + ", getUserLevel()="
				+ getUserLevel() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
