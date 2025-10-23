package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;
	
	public String title;
	public String genre;
	public int year;
	public String author;
	
	public Book() {}
	
	public Book(String title, String author, String genre, int year) {
		this.title= title;
		this.genre = genre;
		this.year = year;
		this.author = author;
	}
	
	public int getId() {
		return id;
	}
	
	public int getYear() {
		return year;
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
	
	void setYear(int year) {
		this.year = year;
	}
	
	void setAuthor(String author) {
		this.author = author;
	}
}
