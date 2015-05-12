package apress.helloworld;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet(urlPatterns={"/hello"}, description="A hello world servlet")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			PrintWriter printWriter = response.getWriter();
			printWriter.println("<h2>");
			printWriter.println("Hello World");
			printWriter.println("</h2>");
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
}
