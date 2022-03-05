/**
 * 
 */
package eden.training.ElonBookStore.bean;

import java.sql.Date;

import lombok.Data;
import lombok.Getter;

/**
 * @author shima
 *
 */

public class UserBean {
	private String userId;
	private String firstName;
	private String firstNameKana;
	private String lastName;
	private String lastNameKana;
	private char sex;
	private String phoneNumber;
//	private Date birthday;
//	private Date dateOfEmployee;
	private String birthday;
	private String dateOfEmployee;
	private char userLevel;
	private String password;
	

}
