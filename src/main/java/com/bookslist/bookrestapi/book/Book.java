package com.bookslist.bookrestapi.book;

public class Book {

	private long id;
	private String image;
	private String title;
	private String author;
	private String price;
	private long rating;
	private String description;

	public Book(long id, String image, String title, String author, String price, long rating, String description) {
		super();
		this.id = id;
		this.image = image;
		this.title = title;
		this.author = author;
		this.price = price;
		this.rating = rating;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public long getRating() {
		return rating;
	}

	public void setRating(long rating) {
		this.rating = rating;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDesription(String desription) {
		this.description = desription;
	}

}

