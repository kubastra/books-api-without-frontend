package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;
	
	@NotBlank(message = "Title cannot be empty")
	public String title;
	
	@NotBlank(message = "Genre cannot be empty")
	public String genre;
	
	@Min(value = 1450, message = "Year must be later than 1450")
	@Max(value = 2025, message = "Year cannot be in the future")
	public int publicationYear;
	
	@NotBlank(message = "Author is required")
	public String author;
	
	public Book() {}
	
	public Book(String title, String author, String genre, int publicationYear) {
		this.title= title;
		this.genre = genre;
		this.publicationYear = publicationYear;
		this.author = author;
	}
	
	public int getId() {
		return id;
	}
	
	public int getpublicationYear() {
		return publicationYear;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public String getAuthor() {
		return author;
	}
	void setGenre(String genre) {
		this.genre = genre;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	
	void setpublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	
	void setAuthor(String author) {
		this.author = author;
	}
}
