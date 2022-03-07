/**
 * 
 */
package com.eden.ElonBookStore.model.dto;

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
@Entity
@Table(name = "tbl_buys")
public class Buys {
	/**
	 * 
	 */
	public Buys() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param isbn
	 * @param amount
	 * @param crDate
	 */
	public Buys(int id, String isbn, int amount, Date crDate) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.amount = amount;
		this.crDate = crDate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, name = "isbn")
	private String isbn;
	
	@Column(nullable = false, name = "amount")
	private int amount;
	
	@Column(nullable = true, name = "cr_date")
	private Date crDate;

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
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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

	@Override
	public String toString() {
		return "Buys [id=" + id + ", isbn=" + isbn + ", amount=" + amount + ", crDate=" + crDate + ", getId()="
				+ getId() + ", getIsbn()=" + getIsbn() + ", getAmount()=" + getAmount() + ", getCrDate()=" + getCrDate()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
