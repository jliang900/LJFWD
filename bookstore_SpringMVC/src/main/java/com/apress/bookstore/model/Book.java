/**
 * 
 */
package com.apress.bookstore.model;

import com.apress.bookstore.model.Author;

/**
 * @author jliang
 *
 */
public class Book {
	private Long bookId;
	private Long categoryId;
	private String bookTitle;
	private Author author;
	private String publisherName;

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long id) {
		this.bookId = id;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String toString() {
		return "Book - Id: " + bookId + ", Book Title: " + bookTitle;
	}
}
