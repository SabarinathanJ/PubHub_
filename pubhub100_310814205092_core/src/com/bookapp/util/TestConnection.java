package com.bookapp.util;

import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println(ConnectionUtil.getConnection());	
	
	}

}
