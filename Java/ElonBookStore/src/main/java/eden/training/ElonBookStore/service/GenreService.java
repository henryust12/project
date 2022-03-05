/**
 * 
 */
package eden.training.ElonBookStore.service;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * @author shima
 *
 */

@Entity
@Table(name="ElonGenres")
public class GenreService {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
//	@ManyToOne
//	@JoinColumn(name = "genre_id", nullable = true)
	private String id;
	
//	@Column(name="GENRE_NAME")
	private String genreName;
	
//	@Column(name="CREATED")
	private String created;
	
//	@Column(name="UPDATED")
	private String update;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
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
	public String getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(String created) {
		this.created = created;
	}

	/**
	 * @return the update
	 */
	public String getUpdate() {
		return update;
	}

	/**
	 * @param update the update to set
	 */
	public void setUpdate(String update) {
		this.update = update;
	}

}
