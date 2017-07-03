package com.bookapp.model;

public class Book {
private	int id;
private		String name;
private		int price;

private		String authorName;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
@Override
public String toString() {
	return "Book [id=" + id + ", price=" + price + ", name=" + name + ", authorName=" + authorName + "]";
}
}
