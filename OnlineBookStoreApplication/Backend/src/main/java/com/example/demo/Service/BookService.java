 package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.*;

import com.example.demo.MyRepo.BookRepo;

@Service
public class BookService {
	@Autowired
	private BookRepo bookrepo;
	public List<Book> getBooks(){
		 return bookrepo.findAll();
	}	
	public Optional<Book> fetchBookById(int id) { 
		return bookrepo.findById(id); 
	}
	public Book saveBook(Book book) {		
		return bookrepo.save(book);
	}
	public String deleteBookById(int id) {
			String result;
			try {
					bookrepo.deleteById(id);
 
					result="Deleted";
 
			}
			catch (Exception e) {
				result="Not Deleted";
			}
			return result; 
}

}
