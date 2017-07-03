<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ChangeName</title>
</head>
<body>
<h1>ChangeName</h1>
<form action="ChangeNameServlet" method="post">
OldName<input type="text" name="oldname"><br><br>
NewName<input type="text" name="newname"><br><br>
<br><br><br><br>
<button type="submit">OK</button><a href="home.jsp"> Home </a>
</form>
</body>
</html>