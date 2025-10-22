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
	
	public Book() {}
	
	public Book(String title) {
		this.title= title;
	}
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
}
