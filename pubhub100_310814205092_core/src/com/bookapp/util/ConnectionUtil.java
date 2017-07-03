package com.bookapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
public static Connection getConnection() throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookapp","root","0000");
	
	
	return connection;
	
}
	
}
