package eden.training.ElonBookStore.service;

import java.sql.Date;



/**
 * @author shima
 *
 */
public class BookService {
//	@Id
//	@Column(name="ISBN")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String isbn;
	
//	@Column(name="TITLE")
	private String title;
	
//	@Column(name="TITLE_KANA")
	private String titleKana;
	
//	@Column(name="PRICE")
	private int price;
	
//	@Column(name="DISCOUNT")
	private int discount;
	
//	@Column(name="STOCK")
	private int stock;
	
//	@Column(name="PUBLISHER")
	private String publisher;
	
//	@Column(name="AUTHOR")
	private String author;
	
//	@Column(name="AUTHOR_KANA")
	private String authorKana;
	
//	@OneToMany(cascade=ALL, mappedBy="ELON_GENRES")
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "ELON_GENRES")
//	@Column(name="GENRE_ID")
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "elon_books")
	private String genreId;
	
//	@Column(name="CREATED")
	private Date created;
	
//	@Column(name="UPDATED")
	private Date updated;

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
	 * @return the genreId
	 */
	public String getGenreId() {
		return genreId;
	}

	/**
	 * @param genreId the genreId to set
	 */
	public void setGenreId(String genreId) {
		this.genreId = genreId;
	}

	/**
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * @return the updated
	 */
	public Date getUpdated() {
		return updated;
	}

	/**
	 * @param updated the updated to set
	 */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
}
