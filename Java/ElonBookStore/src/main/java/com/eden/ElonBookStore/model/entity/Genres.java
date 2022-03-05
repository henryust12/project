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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author shima
 *
 */
@Entity
@Table(name = "TBL_GENRES")
public class Genres implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String genreName;
	
	@Column(nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date created;

	@Column(nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date updated;

}
