package com.project.demo.Demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.Demo1.PersonRepositery.BookRepositery;
import com.project.demo.Demo1.model.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepositery repositery;
	
	public List<Book> findAll() {
		return repositery.findAll();
	}
	
	public Book insert(Book book) {
		return repositery.insert(book);
	}
	
	public List<Book> getBookByStandard(String standard){
		return repositery.getBookByStandard(standard);
	}
}
