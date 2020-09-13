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
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<h3 class="display-4" style = "text-align: center">Welcome Guest</h3>
	
	<button onclick = "window.location.href = 'home'" class="btn btn-primary">Back to Login</button>
	
	<form class="form-inline" method = "get" action = "searchGuestContact">
  		<div class="form-group mb-2">
    		<label>Search Contact by First Name</label>
  		</div>
  		<div class="form-group mx-sm-3 mb-2">
    		<input type="text" class="form-control" name = "searchName">
  		</div>
  		<button type="submit" class="btn btn-primary mb-2">Search</button>
	</form>
	
	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Number</th>
				<th>Email</th>
			</tr>
		</thead>
		
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
	
</body>
</html>