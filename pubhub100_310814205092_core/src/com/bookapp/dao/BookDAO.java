package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookapp.model.Book;
import com.bookapp.util.ConnectionUtil;

public class BookDAO {
	public void add(Book book) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "insert into books (name,price,author_name) values(?,?,?)";
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1, book.getName());
		pst.setInt(2, book.getPrice());
		pst.setString(3, book.getAuthorName());
		pst.executeUpdate();
	}

	public void changeName(String oldName, String newName) throws ClassNotFoundException, SQLException {
		String sql = "update books set name=? where name=?";
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, newName);
		preparedStatement.setString(2, oldName);
		preparedStatement.executeUpdate();

	}

	public void changePrice(Book book) throws ClassNotFoundException, SQLException {
		String sql = "update books set price=? where name=?";
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, book.getPrice());
		preparedStatement.setString(2, book.getName());
		preparedStatement.executeUpdate();

	}


	public List<Book> findAll() throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionUtil.getConnection();

		String sql = "select id,name,price,author_name from books";
		List<Book> books= new ArrayList<Book>();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet rs = preparedStatement.executeQuery();
		
		while (rs.next()) {
			Book book = new Book();
			book.setId(rs.getInt(1));
			book.setName(rs.getString(2));
			book.setPrice(rs.getInt(3));
			book.setAuthorName(rs.getString(4));
			books.add(book);

		}
		return books;
	}

	public List<Book> findByName(String value) throws ClassNotFoundException, SQLException {
		String sql = "select id,name,price,author_name from books where name = ? ";
	
		List<Book> books = new ArrayList<Book>();
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, value);
		ResultSet rs = preparedStatement.executeQuery();
		
		while (rs.next()) {
			Book book = new Book();
			book.setId(rs.getInt(1));
			book.setName(rs.getString(2));
			book.setPrice(rs.getInt(3));
			book.setAuthorName(rs.getString(4));
			books.add(book);
		}
		return books;
	}
	public void remove( String name) throws ClassNotFoundException, SQLException {
		Connection connection=ConnectionUtil.getConnection();
		String sql="delete  from books where  name=?";
		PreparedStatement pst=connection.prepareStatement(sql);
		pst.setString(1, name);
		
	pst.executeQuery();	
	}
}