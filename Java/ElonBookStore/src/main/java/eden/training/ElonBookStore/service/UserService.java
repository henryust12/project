/**
 * 
 */
package eden.training.ElonBookStore.service;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author shima
 *
 */
//
//@Entity
//@Table(name = "ELON_USERS")
public class UserService {
//	@Id
//	@Column(name = "USER_ID")
	private String userId;
	
//	@Column(name = "FIRST_NAME")
	private String firstName;
	
//	@Column(name = "FIRST_NAME_KANA")
	private String firstNameKana;
	
//	@Column(name = "LAST_NAME")
	private String lastName;
	
//	@Column(name = "LAST_NAME_KANA")
	private String lastNameKana;
	
//	@Column(name = "SEX")
	private char sex;
	
//	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	
//	@Column(name = "BIRTHDAY")
	private Date birthday;
	
//	@Column(name = "DATE_OF_EMPLOYEE")
	private Date dateOfEmployee;
	
//	@Column(name = "USER_LEVEL")
	private char userLevel;
	
//	@Column(name = "PASSWORD")
	private String password;

}
