package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}
	
	public List<Book> saveAllBook(List<Book> book) {
		return bookRepository.saveAll(book);
		
	}
	
	public Book getBookById(Integer id) {
		return bookRepository.findById(id).orElse(null);
		
	}
	
	public List<Book> getAllBook(){
		return bookRepository.findAll();
	}
	
	//Delete
	public String deleteAll() {
		bookRepository.deleteAll();
		return "Deleted Successfully";
	}
	
}
