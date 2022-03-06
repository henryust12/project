/**
 *
 */
package com.eden.ElonBookStore.model.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author shima
 *
 */
@Entity
@Table(name="TBL_USERS")
public class Users implements Serializable {
	




	/**
	 * @param userId
	 * @param firstName
	 * @param firstNameKana
	 * @param lastName
	 * @param lastNameKana
	 * @param sex
	 * @param phoneNumber
	 * @param birthday
	 * @param dateOfEmployee
	 * @param userLevel
	 * @param password
	 * @param created
	 * @param updated
	 */
	public Users(String userId, String firstName, String firstNameKana, String lastName, String lastNameKana, char sex,
			String phoneNumber, Date birthday, Date dateOfEmployee, char userLevel, String password, Date created,
			Date updated) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.firstNameKana = firstNameKana;
		this.lastName = lastName;
		this.lastNameKana = lastNameKana;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
		this.dateOfEmployee = dateOfEmployee;
		this.userLevel = userLevel;
		this.password = password;
		this.created = created;
		this.updated = updated;
	}

	@Id
	private String userId;

	@Column(nullable = false, name = "first_name")
	private String firstName;

	@Column(nullable = true, name = "first_name_kana")
	private String firstNameKana;

	@Column(nullable = false, name = "last_name")
	private String lastName;

	@Column(nullable = true, name = "last_name_kana")
	private String lastNameKana;

	@Column(nullable = false, name = "sex")
	private char sex;

	@Column(nullable = true, name = "phone_number")
	private String phoneNumber;

	@Column(nullable = true, name = "birthday")
	private Date birthday;

	@Column(nullable = true, name = "date_of_employee")
	private Date dateOfEmployee; 
 
	@Column(nullable = false, name = "user_level")
	private char userLevel;

	@Column(nullable = true, name = "password")
	private String password;
	

	@Column(nullable = true, name = "created")
	private Date created;

	@Column(nullable = true, name = "updated")
	private Date updated;

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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the firstNameKana
	 */
	public String getFirstNameKana() {
		return firstNameKana;
	}

	/**
	 * @param firstNameKana the firstNameKana to set
	 */
	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the lastNameKana
	 */
	public String getLastNameKana() {
		return lastNameKana;
	}

	/**
	 * @param lastNameKana the lastNameKana to set
	 */
	public void setLastNameKana(String lastNameKana) {
		this.lastNameKana = lastNameKana;
	}

	/**
	 * @return the sex
	 */
	public char getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(char sex) {
		this.sex = sex;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the dateOfEmployee
	 */
	public Date getDateOfEmployee() {
		return dateOfEmployee;
	}

	/**
	 * @param dateOfEmployee the dateOfEmployee to set
	 */
	public void setDateOfEmployee(Date dateOfEmployee) {
		this.dateOfEmployee = dateOfEmployee;
	}

	/**
	 * @return the userLevel
	 */
	public char getUserLevel() {
		return userLevel;
	}

	/**
	 * @param userLevel the userLevel to set
	 */
	public void setUserLevel(char userLevel) {
		this.userLevel = userLevel;
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
	 * @return the created
	 */
	public java.sql.Date getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(java.sql.Date created) {
		this.created = created;
	}

	/**
	 * @return the updated
	 */
	public java.sql.Date getUpdated() {
		return updated;
	}

	/**
	 * @param updated the updated to set
	 */
	public void setUpdated(java.sql.Date updated) {
		this.updated = updated;
	}



	




}
