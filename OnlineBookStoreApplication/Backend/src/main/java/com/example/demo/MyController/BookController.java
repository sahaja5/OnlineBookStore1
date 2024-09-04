package com.example.demo.MyController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Book;

import com.example.demo.Service.BookService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@GetMapping("/getBook")
	 
	public List<Book> fetchBookList() {
 
		List<Book> books=new ArrayList<>(); 
		books=bookService.getBooks();
		return books;
	}
	@GetMapping("/getBook/{id}")
	 
	public Book fetcBookListById(@PathVariable int id) {
		return bookService.fetchBookById(id).get();
	}
 
	@PostMapping("/addBook")
	public Book createBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
	@PutMapping("/updateBook")
	public Book saveorUpdateBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
 
	@DeleteMapping("/deleteBook/{id}")
 
	public String deleteBookById(@PathVariable int id) {
 
	return bookService.deleteBookById(id);
	}

}
