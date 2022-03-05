/**
 * 
 */
package com.eden.ElonBookStore.model.entity;

import java.io.Serializable;

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
	@Id
	private String isbn;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = true)
	private String titleKana;
	
	@Column(nullable = true)
	private int price;
	
	@Column(nullable = false)
	private int discount;
	
	@Column(nullable = false)
	private int stock;
	
	@Column(nullable = false)
	private String publisher;
	
	@Column(nullable = false)
	private String author;
	
	@Column(nullable = false)
	private String authorKana;
	
	@ManyToOne
	@JoinColumn(name = "genre_id")
	private Genres genres;
	
	@Column(nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date created;

	@Column(nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date updated;
	
	
	

}
