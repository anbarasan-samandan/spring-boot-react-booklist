package com.bookslist.bookrestapi.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class BookResource {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public ResponseEntity<?> getBooks(@RequestParam("page") int pageNumber, @RequestParam("limit") int pageLimit){
		
		List<Book> books = bookService.GetBooks(pageNumber, pageLimit);
		int count = bookService.GetBooksCount();
		
		BooksDto bookDto = new BooksDto();
		bookDto.setBooks(books);
		bookDto.setCount(count);
		
		return new ResponseEntity<BooksDto>(bookDto, HttpStatus.OK);
	}	
	
	@GetMapping("/books/{bookid}")
	public ResponseEntity<?>  getBooksByIdAndAuthor(@PathVariable("bookid") int bookId){
		return new ResponseEntity<BookDetailsDto>(bookService.GetBookDetails(bookId), HttpStatus.OK);
	}	
}
