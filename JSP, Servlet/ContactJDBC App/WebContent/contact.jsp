<%@page import="com.techlabs.contact.model.Contact"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.List" %>
  <%@ page import="com.techlabs.contact.model.Contact" %>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact table</title>
</head>
<body>
<h2>Welcome Admin</h2>
Search Contact by First Name :
<form method = "post" action = "searchContact">
 <input type = "text" name = "searchName">
<input type = "submit" value = "search">
</form>
<br><br>
<button onclick = "window.location.href = 'AddContact'">Add Contact</button>
<br><br>
<form method = "get" action = "logout">
<input type = "submit" value = "Logout">
</form>
<br><br>
<table border = "1">
	<tr>
		<th>ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Number</th>
		<th>Email</th>
		<th>Update</th>
		<th>Delete</th>
	</tr>
	
		<c:forEach var="contact" items="${contacts}">
			<tr>
				<td>${contact.id}</td>
				<td>${contact.firstName}</td>
				<td>${contact.lastName}</td>
				<td>${contact.number}</td>
				<td>${contact.email}</td>
				<td>
					<c:url var = "updateLink" value="/updateContact">
						<c:param name="contactId" value="${contact.id}"></c:param>
					</c:url>
					<input type="button" value="UPDATE" onclick="window.location.href='${updateLink}'">
				</td>
				<td>
					<c:url var = "deleteLink" value="/deleteContact">
						<c:param name="contactId" value="${contact.id}"></c:param>
					</c:url>
					<input type="button" value="DELETE" onclick="if (confirm('Are you sure you want to delete?')) window.location.href='${deleteLink}'; else return false;">
				</td>
			</tr>
		</c:forEach>
	
</table>
<br><br>

</body>
</html>