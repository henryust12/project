/**
 * 
 */
package com.eden.ElonBookStore.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author shima
 *
 */

@Entity
@Table(name = "TBL_BUYS")
public class Buys implements Serializable {
	/**
	 * @param id
	 * @param books
	 * @param user
	 * @param amount
	 * @param created
	 */
	public Buys(int id, Books books, Users user, int amount, Date created) {
		super();
		this.id = id;
		this.books = books;
		this.user = user;
		this.amount = amount;
		this.created = created;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "isbn")
	private Books books;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Users user;
	
	@Column(nullable = false)
	private int amount;
	
	@Column(nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date created;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the books
	 */
	public Books getBooks() {
		return books;
	}

	/**
	 * @param books the books to set
	 */
	public void setBooks(Books books) {
		this.books = books;
	}

	/**
	 * @return the user
	 */
	public Users getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(Users user) {
		this.user = user;
	}

	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * @return the created
	 */
	public java.util.Date getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(java.util.Date created) {
		this.created = created;
	}
	
	
	
}
