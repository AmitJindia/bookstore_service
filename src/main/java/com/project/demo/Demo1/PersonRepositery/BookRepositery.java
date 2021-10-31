package com.project.demo.Demo1.PersonRepositery;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.project.demo.Demo1.model.Book;

public interface BookRepositery extends MongoRepository<Book, String> {
	
	public List<Book> findAll();
	
	@SuppressWarnings("unchecked")
	public Book insert(Book book);
	
	@Query("{standard :?0}")                                                  //SQL Equivalent : SELECT * FROM BOOK WHERE standard=
    public List<Book> getBookByStandard(String standard);
}
