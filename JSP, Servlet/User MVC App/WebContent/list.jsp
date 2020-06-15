<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.techlabs.model.user.User" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Users</title>
</head>
<body>
<h2>List of Users</h2>
<form method = "get" action = "SearchController">
 <input type = "text" name = "searchName">
<input type = "submit" value = "search">
</form><br>
<button onclick = "window.location.href = 'add.jsp'">Add Contact</button>
<br><br>
<form method = "get" action = "LogoutController">
	<input type = "submit" value = "Logout">
</form><br>
<table border = "1">
	<tr>
		<th>ID</th>
		<th>Username</th>
		<th>Password</th>
		<th>Update</th>
		<th>Delete</th>
	</tr>
	<%
	List<User> users = (List<User>)request.getAttribute("users");
	for(int i = 0; i < users.size(); i++){
		out.println("<tr>");
		out.println("<td>" + users.get(i).getId() + "</td>");
		out.println("<td>" + users.get(i).getUsername() + "</td>");
		out.println("<td>" + users.get(i).getPassword() + "</td>");
		out.println("<td>");
		out.println("<form method = 'get' action = 'PrepopulateController'>");
		out.println("<input type = 'hidden' name = 'userId' value =" + users.get(i).getId() + ">");
		out.println("<input type = 'submit' value = 'update'></td>");
		out.println("</form>");
		out.println("</td>");
		out.println("<td>");
		out.println("<form method = 'post' action = 'DeleteController'>");
		out.println("<input type = 'hidden' name = 'userId' value =" + users.get(i).getId() + ">");
		out.println("<input type = 'submit' value = 'delete'></td>");
		out.println("</form>");
		out.println("</td>");
		out.println("</tr>");
	}
	%>
</table>
</body>
</html>