package com.example.demo;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	final BookService bookService;
		
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@PostMapping("/books")
	public void addBook(@RequestBody Book book) {
		bookService.addBook(book);
	}
	
	@GetMapping("/books")
	public List<Book> show() {
		return bookService.showAllBooks();
	}
}
