<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.techlabs.contact.model.Contact" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Contacts</title>
</head>
<body>
<h1>List of Contacts</h1>
<form method = "get" action = "searchController">
 <input type = "text" name = "searchName">
<input type = "submit" value = "search">
</form>
<button onclick = "window.location.href = 'add.jsp'">Add Contact</button>
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
	<%
	List<Contact> contacts = (List<Contact>)request.getAttribute("contacts");
	for(int i = 0; i < contacts.size(); i++){
		out.println("<tr>");
		out.println("<td>" + contacts.get(i).getId() + "</td>");
		out.println("<td>" + contacts.get(i).getFirstName() + "</td>");
		out.println("<td>" + contacts.get(i).getLastName() + "</td>");
		out.println("<td>" + contacts.get(i).getNumber() + "</td>");
		out.println("<td>" + contacts.get(i).getEmail() + "</td>");
		out.println("<td>");
		out.println("<form method = 'get' action = 'PrepopulateController'>");
		out.println("<input type = 'hidden' name = 'contactId' value =" + contacts.get(i).getId() + ">");
		out.println("<input type = 'submit' value = 'update'></td>");
		out.println("</form>");
		out.println("</td>");
		out.println("<td>");
		out.println("<form method = 'post' action = 'DeleteController'>");
		out.println("<input type = 'hidden' name = 'contactId' value =" + contacts.get(i).getId() + ">");
		out.println("<input type = 'submit' value = 'delete'></td>");
		out.println("</form>");
		out.println("</td>");
		out.println("</tr>");
	}
	%>
</table>
</body>
</html>