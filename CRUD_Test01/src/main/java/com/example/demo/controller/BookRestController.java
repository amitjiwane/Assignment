package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Book;
import com.example.demo.service.BookService;

@RestController
public class BookRestController {

	@Autowired
	private BookService bookService;
	
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
	
	@PostMapping("/addBooks")
	public List<Book> addBooks(@RequestBody List<Book> book){
		return bookService.saveAllBook(book);
	}
	
	@GetMapping("/bookById/{id}")
	public Book findBookById(Integer id) {
		return bookService.getBookById(id);
	}
	
	@GetMapping("/allBooks")
	public List<Book> findAllBooks(){
		return bookService.getAllBook();
	}
	
	@DeleteMapping("/deleteAll")
	public void deleteAllBooks() {
		bookService.deleteAll();
		
	}
}
