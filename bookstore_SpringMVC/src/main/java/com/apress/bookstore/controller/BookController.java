/**
 * 
 */
package com.apress.bookstore.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.apress.bookstore.service.BookService;

/**
 * @author jliang
 *
 */
public class BookController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		BookService bookService = new BookService();
		ModelAndView modelAndView = new ModelAndView("bookList");
		modelAndView.addObject("bookList", bookService.getBookList());
		return modelAndView;
	}

}
