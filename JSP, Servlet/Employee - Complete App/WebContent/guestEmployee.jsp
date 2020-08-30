<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.List" %>
  <%@ page import="com.techlabs.employee.model.Employee" %>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Guest table</title>
</head>
<body>
Search Employee by Name :
<form method = "get" action = "searchGuestEmployee">
 <input type = "text" name = "searchName">
<input type = "submit" value = "search">
</form>
<br><br>
<table border = "1">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Salary</th>
		<th>Designation</th>
	</tr>
	
		<c:forEach var="employee" items="${employees}">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.name}</td>
				<td>${employee.salary}</td>
				<td>${employee.designation}</td>
			</tr>
		</c:forEach>
	
</table>
<br><br>
<form method = "get" action = "home">
<input type = "submit" value = "Back to Login">
</form>
</body>
</html>