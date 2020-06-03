<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@page import="com.techlabs.contact.model.Contact"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Contacts</title>
</head>
<body>
<%
if((session.getAttribute("username") == null)&&(session.getAttribute("password") == null)){
	response.sendRedirect("login.jsp");
}
%>
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
	List<Contact> contacts = (List<Contact>)request.getAttribute("searchContacts");
	for(int i = 0; i < contacts.size(); i++){
		out.println("<tr>");
		out.println("<td>" + contacts.get(i).getId() + "</td>");
		out.println("<td>" + contacts.get(i).getFirstName() + "</td>");
		out.println("<td>" + contacts.get(i).getLastName() + "</td>");
		out.println("<td>" + contacts.get(i).getNumber() + "</td>");
		out.println("<td>" + contacts.get(i).getEmail() + "</td>");
		out.println("<td>");
		out.println("<form method = 'post' action = 'PrepopulateContactController'>");
		out.println("<input type = 'hidden' name = 'contactId' value =" + contacts.get(i).getId() + ">");
		out.println("<input type = 'submit' value = 'update'></td>");
		out.println("</form>");
		out.println("</td>");
		out.println("<td>");
		out.println("<form method = 'post' action = 'DeleteContactController'>");
		out.println("<input type = 'hidden' name = 'contactId' value =" + contacts.get(i).getId() + ">");
		out.println("<input type = 'submit' value = 'delete'></td>");
		out.println("</form>");
		out.println("</td>");
		out.println("</tr>");
	}
	%>
</table>
<br><br>
<form method = "get" action = "LogoutController">
<input type = "submit" value = "Logout">
</form>
</body>
</html>