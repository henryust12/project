/**
 * 
 */
package eden.training.ElonBookStore.dto;



import java.util.Date;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

/**
 * @author shima
 *
 */

public class UserDto {
	private String userId;
	private String firstName;
	private String firstNameKana;
	private String lastName;
	private String lastNameKana;
	private char sex;
	private String phoneNumber;
	private String birthday;
	private String dateOfEmployee;
	private char userLevel;
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
	public String getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
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
	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", firstName=" + firstName + ", firstNameKana=" + firstNameKana
				+ ", lastName=" + lastName + ", lastNameKana=" + lastNameKana + ", sex=" + sex + ", phoneNumber="
				+ phoneNumber + ", birthday=" + birthday + ", dateOfEmployee=" + dateOfEmployee + ", userLevel="
				+ userLevel + ", password=" + password + ", getUserId()=" + getUserId() + ", getFirstName()="
				+ getFirstName() + ", getFirstNameKana()=" + getFirstNameKana() + ", getLastName()=" + getLastName()
				+ ", getLastNameKana()=" + getLastNameKana() + ", getSex()=" + getSex() + ", getPhoneNumber()="
				+ getPhoneNumber() + ", getBirthday()=" + getBirthday() + ", getDateOfEmployee()=" + getDateOfEmployee()
				+ ", getUserLevel()=" + getUserLevel() + ", getPassword()=" + getPassword() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

	


}
