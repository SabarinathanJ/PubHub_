package com.bookapp.dao;

import com.bookapp.model.User;

public class TestDAO {

	public static void main(String[] args) {
		User user = new User();

		user.setId(1);
		user.setName("selva");
		user.setEmail("selva@gmail.com");
		user.setPassword("1234");

		System.out.println(user);

	}

}
