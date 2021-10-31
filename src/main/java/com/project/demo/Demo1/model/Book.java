package com.project.demo.Demo1.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="book")
public class Book {

	@Id
	private String id;
	private String bookName;
	private double price;
	private String standard;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String id, String bookName, double price, String standard) {
		this.id = id;
		this.bookName = bookName;
		this.price = price;
		this.standard=standard;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", price=" + price + ", standard=" + standard + "]";
	}
	
}
