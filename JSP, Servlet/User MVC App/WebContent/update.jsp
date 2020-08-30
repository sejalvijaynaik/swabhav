 <%@ page import="com.techlabs.model.User" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update form</title>
</head>
<body>
<h2>Update User</h2>
<form method = "POST" action = "updateUser">
Username : <input type = "text" name = "username" value = "${username}" required><br><br>
Password : <input type = "text" name = "password" value = "${password}" required><br><br>
<input type = "submit" value = "Submit">
</form>
</body>
</html>