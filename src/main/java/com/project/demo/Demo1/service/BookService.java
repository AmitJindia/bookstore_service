package com.project.demo.Demo1.service;

import java.util.List;

import com.project.demo.Demo1.model.Book;

public interface BookService {

	public List<Book> findAll();
	
	public Book insert(Book book);
	
    public List<Book> getBookByStandard(String standard);
}
