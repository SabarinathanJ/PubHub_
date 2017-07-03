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
 * Servlet implementation class ChangeNameServlet
 */
@WebServlet("/ChangeNameServlet")
public class ChangeNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
String name1=		request.getParameter("oldname");
String name2=        request.getParameter("newname");
    Book book=new Book(); 
    BookDAO bdao=new BookDAO();
    
    	
    
    
    try {
		bdao.changeName(name1,name2);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		//response.sendRedirect("failure.jsp");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		response.sendRedirect("failure.jsp");
	}
   // response.sendRedirect("sucess.jsp");
	}

}
