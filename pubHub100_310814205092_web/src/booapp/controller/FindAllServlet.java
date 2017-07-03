package booapp.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.dao.BookDAO;
import com.bookapp.model.Book;

/**
 * Servlet implementation class FindAllServlet
 */
@WebServlet("/FindAllServlet")
public class FindAllServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		BookDAO bdao = new BookDAO();
		//
		
		 

			// bdao.findAll();
			try {
				List<Book> books = bdao.findAll();
				if (books.size() > 0){

					RequestDispatcher dispatcher = request.getRequestDispatcher("FindAll1.jsp");
					request.setAttribute("list1", books);
					dispatcher.forward(request, response);

				// Book book=new Book();

				}
				 else {
						response.sendRedirect("failure.jsp");
					}
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}
}