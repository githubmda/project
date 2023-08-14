package com.example.bootdemo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookStore 
{
	@Id
	private int bookId;
	private String bookName;
	private double price;
	private int section;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}	
}