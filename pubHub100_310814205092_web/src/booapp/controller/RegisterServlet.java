package booapp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.dao.UserDAO;
import com.bookapp.model.User;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		User user = new User();

		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);

		UserDAO Udao = new UserDAO();
		try {
			Udao.register(user);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println(Udao.toString());
	}

}
