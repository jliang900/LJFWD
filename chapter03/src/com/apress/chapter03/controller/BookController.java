package com.apress.chapter03.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.apress.chapter03.model.Book;
import com.apress.chapter03.model.Author;

/**
 * Servlet implementation class BookController
 */
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Book book = new Book();
		book.setBookTitle("Learning Java Web");
		Author author = new Author();
		author.setName("Vishal Layka");
		book.setAuthor(author);

		request.setAttribute("bookAttrib", book);

		RequestDispatcher view = request.getRequestDispatcher("/book.jsp");
		view.forward(request, response);
	}

}
