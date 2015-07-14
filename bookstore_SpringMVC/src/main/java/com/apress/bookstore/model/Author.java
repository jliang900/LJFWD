/**
 * 
 */
package com.apress.bookstore.model;

/**
 * @author jliang
 *
 */
public class Author {
	private Long authorId;
	private String authorName;

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long id) {
		this.authorId = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String name) {
		this.authorName = name;
	}

	public String toString() {
		return "Author - Id: " + authorId + ", Name: " + authorName;
	}
}
