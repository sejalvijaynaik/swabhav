<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.List" %>
  <%@ page import="com.techlabs.contact.model.Contact" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Guest table</title>
</head>
<body>
Search Contact by Name :
<form method = "post" action = "GuestSerachContactComtroller">
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
	<%
	List<Contact> contacts = (List<Contact>)request.getAttribute("contacts");
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
<form method = "get" action = "home.jsp">
<input type = "submit" value = "Back to Login">
</form>
</body>
</html>