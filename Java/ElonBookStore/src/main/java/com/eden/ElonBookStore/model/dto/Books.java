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
@Table(name = "tbl_books")
public class Books {
	

	/**
	 * 
	 */
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param isbn
	 * @param title
	 * @param titleKana
	 * @param price
	 * @param discount
	 * @param publisher
	 * @param author
	 * @param authorKana
	 * @param genre
	 * @param crDate
	 * @param upDate
	 */
	public Books(String isbn, String title, String titleKana, int price, int discount, String publisher, String author,
			String authorKana, String genre, Date crDate, Date upDate) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.titleKana = titleKana;
		this.price = price;
		this.discount = discount;
		this.publisher = publisher;
		this.author = author;
		this.authorKana = authorKana;
		this.genre = genre;
		this.crDate = crDate;
		this.upDate = upDate;
	}

	@Id
	private String isbn;
	
	@Column(nullable = false, name = "title")
	private String title;
	
	@Column(nullable = true, name = "title_kana")
	private String titleKana;
	
	@Column(nullable = true, name = "price")
	private int price;
	
	@Column(nullable = false, name = "discount")
	private int discount;
	
	@Column(nullable = false, name = "publisher")
	private String publisher;
	
	@Column(nullable = false, name = "author")
	private String author;
	
	@Column(nullable = false, name = "author_kana")
	private String authorKana;
	
	@Column(name = "genre")
	private String genre;
	
	@Column(nullable = true, name = "cr_date")
	private Date crDate;

	@Column(nullable = true, name = "up_date")
	private Date upDate;

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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the titleKana
	 */
	public String getTitleKana() {
		return titleKana;
	}

	/**
	 * @param titleKana the titleKana to set
	 */
	public void setTitleKana(String titleKana) {
		this.titleKana = titleKana;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the discount
	 */
	public int getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(int discount) {
		this.discount = discount;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the authorKana
	 */
	public String getAuthorKana() {
		return authorKana;
	}

	/**
	 * @param authorKana the authorKana to set
	 */
	public void setAuthorKana(String authorKana) {
		this.authorKana = authorKana;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
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

	@Override
	public String toString() {
		return "Books [isbn=" + isbn + ", title=" + title + ", titleKana=" + titleKana + ", price=" + price
				+ ", discount=" + discount + ", publisher=" + publisher + ", author=" + author + ", authorKana="
				+ authorKana + ", genre=" + genre + ", crDate=" + crDate + ", upDate=" + upDate + ", getIsbn()="
				+ getIsbn() + ", getTitle()=" + getTitle() + ", getTitleKana()=" + getTitleKana() + ", getPrice()="
				+ getPrice() + ", getDiscount()=" + getDiscount() + ", getPublisher()=" + getPublisher()
				+ ", getAuthor()=" + getAuthor() + ", getAuthorKana()=" + getAuthorKana() + ", getGenre()=" + getGenre()
				+ ", getCrDate()=" + getCrDate() + ", getUpDate()=" + getUpDate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



}
