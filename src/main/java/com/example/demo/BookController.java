package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class BookController {

	final BookService bookService;
		
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@PostMapping("/books")
	public void addBook(@Valid @RequestBody Book book) {
		bookService.addBook(book);
	}
	
	@GetMapping("/books")
	public List<Book> show() {
		return bookService.showAllBooks();
	}
}
