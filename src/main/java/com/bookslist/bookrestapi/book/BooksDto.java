package com.bookslist.bookrestapi.book;

import java.util.List;

public class BooksDto {
	private int booksCount;
	private List<Book> books;

	public BooksDto() {
		super();

	}

	public int getCount() {
		return booksCount;
	}

	public void setCount(int count) {
		this.booksCount = count;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

}
