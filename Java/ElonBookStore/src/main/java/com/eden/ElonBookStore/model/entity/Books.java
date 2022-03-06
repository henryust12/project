/**
 * 
 */
package com.eden.ElonBookStore.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "TBL_BOOKS")
public class Books implements Serializable {
	/**
	 * @param isbn
	 * @param title
	 * @param titleKana
	 * @param price
	 * @param discount
	 * @param stock
	 * @param publisher
	 * @param author
	 * @param authorKana
	 * @param genres
	 * @param created
	 * @param updated
	 */
	public Books(String isbn, String title, String titleKana, int price, int discount, int stock, String publisher,
			String author, String authorKana, Genres genres, Date created, Date updated) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.titleKana = titleKana;
		this.price = price;
		this.discount = discount;
		this.stock = stock;
		this.publisher = publisher;
		this.author = author;
		this.authorKana = authorKana;
		this.genres = genres;
		this.created = created;
		this.updated = updated;
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
	
	@Column(nullable = false, name = "stock")
	private int stock;
	
	@Column(nullable = false, name = "publisher")
	private String publisher;
	
	@Column(nullable = false, name = "author")
	private String author;
	
	@Column(nullable = false, name = "author_kana")
	private String authorKana;
	
	@ManyToOne
	@JoinColumn(name = "genre_id")
	private Genres genres;
	
	@Column(nullable = true, name = "created")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date created;

	@Column(nullable = true, name = "updated")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date updated;

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
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
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
	 * @return the genres
	 */
	public Genres getGenres() {
		return genres;
	}

	/**
	 * @param genres the genres to set
	 */
	public void setGenres(Genres genres) {
		this.genres = genres;
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

	/**
	 * @return the updated
	 */
	public java.util.Date getUpdated() {
		return updated;
	}

	/**
	 * @param updated the updated to set
	 */
	public void setUpdated(java.util.Date updated) {
		this.updated = updated;
	}
	
	
	

}
