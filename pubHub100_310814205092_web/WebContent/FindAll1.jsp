


< % taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page import="com.bookapp.model.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.bookapp.dao.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=1>
<tr>
<th>BookId</th>
<th>BookName</th>
<th>BookPrice</th>
<% BookDAO dao= new BookDAO();
List <Book> list=dao.findAll();
for(Book book:list)
{
	 %>
	<tr>
	<td> <%= book.getId() %> </td>
	<td><%= book.getName() %> </td>
	<td><%= book.getPrice() %> </td>
	
	</tr>
	<%
	
	
	
	
}

%>

</table>

</body>
</html>