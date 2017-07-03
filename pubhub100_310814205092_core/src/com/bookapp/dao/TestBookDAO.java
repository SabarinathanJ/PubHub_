package com.bookapp.dao;

import com.bookapp.model.Book;

public class TestBookDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book();

book.setId(1);
book.setName("java6");
book.setPrice(300);
book.setAuthorName("aaa");


System.out.println(book);


	}

}
