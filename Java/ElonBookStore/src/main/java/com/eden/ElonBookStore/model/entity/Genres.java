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
	/**
	 * @param id
	 * @param genreName
	 * @param created
	 * @param updated
	 */
	public Genres(int id, String genreName, Date created, Date updated) {
		super();
		this.id = id;
		this.genreName = genreName;
		this.created = created;
		this.updated = updated;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, name = "genre_name")
	private String genreName;
	
	@Column(nullable = true, name = "created")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date created;

	@Column(nullable = true, name = "updated")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date updated;

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
	 * @return the genreName
	 */
	public String getGenreName() {
		return genreName;
	}

	/**
	 * @param genreName the genreName to set
	 */
	public void setGenreName(String genreName) {
		this.genreName = genreName;
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
