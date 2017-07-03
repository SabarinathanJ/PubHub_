package booapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookapp.dao.UserDAO;
import com.bookapp.model.User;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		User user=new User();
		user.setEmail(email);
		user.setPassword(password);
		UserDAO Udao=new UserDAO();
		
	
	try{
		
	
		
			boolean flag=true;
			Udao.Login(user);
		//String var="Welcome";
	//	HttpSession session=request.getSession();
	//	session.setAttribute("s", "var");
		if(flag){
			response.sendRedirect("sucess.jsp");
		}
		else{
			response.sendRedirect("failure.jsp");
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	}
	}


