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
	@Id
	private String userId;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = true)
	private String firstNameKana;

	@Column(nullable = false)
	private String lastName;

	@Column(nullable = true)
	private String lastNameKana;

	@Column(nullable = false)
	private char sex;

	@Column(nullable = true)
	private String phoneNumber;

	@Column(nullable = true)
	private Date birthday;

	@Column(nullable = false)
	private String dateOfEmployee;

	@Column(nullable = false)
	private char userLevel;

	@Column(nullable = true)
	private String password;
	

	@Column(nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date created;

	@Column(nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date updated;












}
