package com.project.demo.Demo1.rest;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.demo.Demo1.model.Book;
import com.project.demo.Demo1.service.BookService;

@CrossOrigin(origins = "*")
@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	BookService service;
	
	@GetMapping("/")
	public String health() {
		return "hi" +LocalDateTime.now();
	}
	
	@GetMapping("/getBooks")
	public ResponseEntity<Book> getBooks(@RequestParam Integer id) {
		
		
		return new ResponseEntity<Book>((Book) service.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/postBook")
	public ResponseEntity<String> postBook(@RequestBody Book book){
		
		service.insert(book);
		
		return new ResponseEntity<String>("Done",HttpStatus.OK);
	}
	
	@GetMapping("/getBookByStandard")
	public ResponseEntity<List> getBookByStandard(@RequestParam String standard) {
		
		System.out.println(service.getBookByStandard(standard));
		return new ResponseEntity<List>(service.getBookByStandard(standard),HttpStatus.OK);
	}
//	@GetMapping("/all")
//	public List<Person> findAll(){
//		return service.findAll();
//	}
//	
//	@GetMapping("/one")
//	public String findOne(@RequestParam Integer id) {
//		System.out.println(id);
//		return "";
//	}

}
