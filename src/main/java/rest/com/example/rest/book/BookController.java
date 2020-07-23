package rest.com.example.rest.book;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping("/books")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@RequestMapping("/books/{id}")
	public Book getBook(@PathVariable String id) {
		return bookService.getBook(id);
	}

	@PostMapping(value = "/books")
	public void addBook(@RequestBody Book book) {
		bookService.addBook(book);
	}
	
	@PutMapping(value = "/books/{id}")
	public void updateBook(@RequestBody Book book,@PathVariable String id) {
		bookService.updateBook(id,book);
	}
	
	
	@DeleteMapping(value = "/books/{id}")
	public void deleteTopic(@PathVariable String id) {
		bookService.deleteBook(id);
	}
	
	
	
	
	
	
	

}
