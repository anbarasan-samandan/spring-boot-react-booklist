package com.bookslist.bookrestapi.book;

import java.util.List;

public class BookDetailsDto {
	private Book book;
	private List<Book> booksFromAuthor;

	public BookDetailsDto() {
		super();
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public List<Book> getBooksFromAuthor() {
		return booksFromAuthor;
	}

	public void setBooksFromAuthor(List<Book> booksFromAuthor) {
		this.booksFromAuthor = booksFromAuthor;
	}

}
