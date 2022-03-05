/**
 * 
 */
package com.eden.ElonBookStore.model.entity;

import java.io.Serializable;

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
	
	
	
}
