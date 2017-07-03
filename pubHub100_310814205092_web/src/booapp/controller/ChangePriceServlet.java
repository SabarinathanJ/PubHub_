package booapp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.dao.BookDAO;
import com.bookapp.model.Book;

/**
 * Servlet implementation class ChangePriceServlet
 */
@WebServlet("/ChangePriceServlet")
public class ChangePriceServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String price1=request.getParameter("newprice");
		String name=request.getParameter("name");
		Book book=new Book();
		book.setPrice( Integer.parseInt(price1));
		book.setName(name);
		BookDAO bdao=new BookDAO();
		try {
			bdao.changePrice(book);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
