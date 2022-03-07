/**
 * 
 */
package com.eden.ElonBookStore.model.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author shima
 *
 */
@Entity
@Table(name = "tbl_users")
public class Users {
	

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
	 * @param crDate
	 * @param upDate
	 */
	public Users(String userId, String firstName, String firstNameKana, String lastName, String lastNameKana, char sex,
			String phoneNumber, Date birthday, String dateOfEmployee, char userLevel, String password, Date crDate,
			Date upDate) {
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
		this.crDate = crDate;
		this.upDate = upDate;
	}

	/**
	 * 
	 */
	public Users() {
		super();
		// TODO Auto-generated constructor stub
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

	@Column(nullable = false, name = "date_of_employee")
	private String dateOfEmployee;

	@Column(nullable = false, name = "user_level")
	private char userLevel;

	@Column(nullable = true, name = "password")
	private String password;
	 
	@Column(nullable = true, name = "cr_date")
	private Date crDate;

	@Column(nullable = true, name = "up_date")
	private Date upDate;

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", firstName=" + firstName + ", firstNameKana=" + firstNameKana
				+ ", lastName=" + lastName + ", lastNameKana=" + lastNameKana + ", sex=" + sex + ", phoneNumber="
				+ phoneNumber + ", birthday=" + birthday + ", dateOfEmployee=" + dateOfEmployee + ", userLevel="
				+ userLevel + ", password=" + password + ", crDate=" + crDate + ", upDate=" + upDate + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

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
	public String getDateOfEmployee() {
		return dateOfEmployee;
	}

	/**
	 * @param dateOfEmployee the dateOfEmployee to set
	 */
	public void setDateOfEmployee(String dateOfEmployee) {
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
	 * @return the crDate
	 */
	public Date getCrDate() {
		return crDate;
	}

	/**
	 * @param crDate the crDate to set
	 */
	public void setCrDate(Date crDate) {
		this.crDate = crDate;
	}

	/**
	 * @return the upDate
	 */
	public Date getUpDate() {
		return upDate;
	}

	/**
	 * @param upDate the upDate to set
	 */
	public void setUpDate(Date upDate) {
		this.upDate = upDate;
	}

	

}
