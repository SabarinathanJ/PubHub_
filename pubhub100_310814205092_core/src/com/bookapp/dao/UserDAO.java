package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookapp.model.User;
import com.bookapp.util.ConnectionUtil;

public class UserDAO {
	public void  register(User user) throws ClassNotFoundException, SQLException {
		Connection connection=ConnectionUtil.getConnection();
		String sql=("insert into users1(name,email,password) values(?,?,?)");
		
		PreparedStatement pst=connection.prepareStatement(sql);
		pst.setString(1, user.getName());
		pst.setString(2, user.getEmail());
		pst.setString(3, user.getPassword());
	
		
		pst.executeUpdate();
	}
	
	

	public static boolean Login(User user) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select name from users1 where email=? and password=?;";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, user.getEmail());
		preparedStatement.setString(2, user.getPassword());
		ResultSet rs = preparedStatement.executeQuery();
		boolean flag=false;
		if (rs.next()) {
			flag=true;
		} 
	
		
		return flag;
	
}
}

