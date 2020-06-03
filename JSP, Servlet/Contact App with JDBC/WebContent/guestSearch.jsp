<%@page import="com.techlabs.contact.model.Contact"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="com.techlabs.contact.model.Contact" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Guest Search</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Number</th>
			<th>Email</th>
		</tr>
		<%
	List<Contact> contacts = (List<Contact>)request.getAttribute("searchContacts");
	for(int i = 0; i < contacts.size(); i++){
		out.println("<tr>");
		out.println("<td>" + contacts.get(i).getId() + "</td>");
		out.println("<td>" + contacts.get(i).getFirstName() + "</td>");
		out.println("<td>" + contacts.get(i).getLastName() + "</td>");
		out.println("<td>" + contacts.get(i).getNumber() + "</td>");
		out.println("<td>" + contacts.get(i).getEmail() + "</td>");
		out.println("</tr>");
	}
	%>
	</table>
<br><br>
<button onclick = "window.location.href = 'home.jsp'">Back to Login</button>
</body>
</html>