/**
 * 
 */
package com.apress.bookstore.service;

import java.util.LinkedList;
import java.util.List;
import com.apress.bookstore.model.Author;
import com.apress.bookstore.model.Book;

/**
 * @author jliang
 *
 */
public class BookService {
	private static List<Book> bookList;

	static {
		Author author1 = new Author();
		author1.setAuthorId((long) 1);
		author1.setAuthorName("Vishal Layka");
		Book book1 = new Book();
		book1.setBookId((long) 1);
		book1.setBookTitle("Beginning Groovy, Grails and Griffon");
		book1.setAuthor(author1);

		Book book2 = new Book();
		book2.setBookId((long) 2);
		book2.setBookTitle("Modern Java Web Development");
		book2.setAuthor(author1);
		bookList = new LinkedList<Book>();
		bookList.add(book1);
		bookList.add(book2);
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public Book createBook(Book b) {
		Book book = new Book();
		book.setBookId((long) bookList.size() + 1);
		book.setAuthor(b.getAuthor());
		book.setBookTitle(b.getBookTitle());
		bookList.add(book);
		return book;
	}
}
