<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.List" %>
  <%@ page import="com.techlabs.contact.model.Contact" %>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Guest table</title>
</head>
<body>
Search Contact by Name :
<form method = "get" action = "searchGuestContact">
 <input type = "text" name = "searchName">
<input type = "submit" value = "search">
</form>
<br><br>
<table border = "1">
	<tr>
		<th>ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Number</th>
		<th>Email</th>
	</tr>
	
		<c:forEach var="contact" items="${contacts}">
			<tr>
				<td>${contact.id}</td>
				<td>${contact.firstName}</td>
				<td>${contact.lastName}</td>
				<td>${contact.number}</td>
				<td>${contact.email}</td>
			</tr>
		</c:forEach>
	
</table>
<br><br>
<form method = "get" action = "home">
<input type = "submit" value = "Back to Login">
</form>
</body>
</html>