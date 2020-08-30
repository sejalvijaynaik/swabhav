<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.techlabs.model.User" %>
    <%@ page import="java.util.List" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Users</title>
</head>
<body>
<h1>WELCOME</h1>
	<input type="button" value="Logout" onclick="window.location.href='logout'">

	<input type="button" value="Update Account" onclick="window.location.href='updateUser'">
	
	<input type="button" value="Delete Account" onclick="window.location.href='deleteUser'">

</body>
</html>