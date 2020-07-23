package rest.com.example.rest.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {

	private List<Book> books = new ArrayList<>(
			Arrays.asList(
					new Book("sapiens", "Sapeins : A brief history of mankind", "This is the description"),
					new Book("habit", "Atomic Habit", "This is the description"),
					new Book("deus", "Homo Deus", "This is the description"),
					new Book("demon", "The Demon Haunted World", "This is the description")
					));

	public List<Book> getAllBooks() {

		return books;
	}

	public Book getBook(String id) {
		return books.stream().filter(b -> b.getId().equals(id)).findFirst().get();
	}

	public void addBook(Book book) {
		// TODO Auto-generated method stub
		books.add(book);
	}

	public void updateBook(String id, Book book) {
		for(int i=0;i <books.size();i++) {
			Book b = books.get(i);
			
			if( b.getId().equals(id)){
				books.set(i, book);
				return;
			}
		}
		
	}

	public void deleteBook(String id) {
		books.removeIf(b -> b.getId().equals(id));
	}

}
