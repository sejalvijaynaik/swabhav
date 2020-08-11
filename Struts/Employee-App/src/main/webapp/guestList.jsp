<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.techlabs.model.Employee" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Guest Employee List</title>
</head>
<body>
<h2>Guest Employee List</h2>
<form method = "get" action = "GuestSearchController">
 <input type = "text" name = "searchName">
<input type = "submit" value = "search">
</form><br>
<button onclick = "window.location.href = 'index.jsp'">Back to home</button>
<br><br>
<table border = "1">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Salary</th>
		<th>Designation</th>
	</tr>
	<%
	List<Employee> employees = (List<Employee>)request.getAttribute("employees");
	for(int i = 0; i < employees.size(); i++){
		out.println("<tr>");
		out.println("<td>" + employees.get(i).getId() + "</td>");
		out.println("<td>" + employees.get(i).getName() + "</td>");
		out.println("<td>" + employees.get(i).getSalary() + "</td>");
		out.println("<td>" + employees.get(i).getDesignation() + "</td>");
		out.println("</tr>");
	}
	%>
</table>
</body>
</body>
</html>