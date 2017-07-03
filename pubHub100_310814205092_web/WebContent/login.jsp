<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
<form action="loginServlet" method="post">
<h2>Login</h2>
Email:<input type="email" name="mail" required/><br>
Password:<input type="password" name="password" required /><br>
<button type="submit">login</button>
<a href="home.jsp"> Home </a>
</form>
</body>
</html>