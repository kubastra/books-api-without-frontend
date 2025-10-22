package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {

	final BookRepo bookRepo;
	
	public BookService(BookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	List<Book> showAllBooks() {
		return bookRepo.findAll();
	}
	
	void addBook(Book book) {
		bookRepo.save(book);
	}
	
	void deleteBook(Integer id) {
		bookRepo.deleteById(id);
	}
}
