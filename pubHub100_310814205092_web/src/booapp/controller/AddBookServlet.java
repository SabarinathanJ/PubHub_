package booapp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.dao.BookDAO;
import com.bookapp.dao.UserDAO;
import com.bookapp.model.Book;
import com.bookapp.model.User;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String name = request.getParameter("name");
		
		String price = request.getParameter("price");
		
		String authorName = request.getParameter("authorName");

		Book book = new Book();

		book.setName(name);
		book.setPrice(Integer.parseInt(price));
		
		book.setAuthorName(authorName);

	BookDAO bdao = new BookDAO();
		try {
			bdao.add(book);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//System.out.println(bdao.toString());
	}
	}


