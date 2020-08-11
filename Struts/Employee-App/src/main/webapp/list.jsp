<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.techlabs.model.Employee" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Employees</title>
</head>
<body>
<h2>List of Employees</h2>
<form method = "get" action = "SearchController">
 <input type = "text" name = "searchName">
<input type = "submit" value = "search">
</form>
<button onclick = "window.location.href = 'add.jsp'">Add Contact</button>
<br><br>
<form method = "get" action = "LogoutController">
	<input type = "submit" value = "Logout">
</form>
<table border = "1">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Salary</th>
		<th>Designation</th>
		<th>Update</th>
		<th>Delete</th>
	</tr>
	<%
	List<Employee> employees = (List<Employee>)request.getAttribute("employees");
	for(int i = 0; i < employees.size(); i++){
		out.println("<tr>");
		out.println("<td>" + employees.get(i).getId() + "</td>");
		out.println("<td>" + employees.get(i).getName() + "</td>");
		out.println("<td>" + employees.get(i).getSalary() + "</td>");
		out.println("<td>" + employees.get(i).getDesignation() + "</td>");
		out.println("<td>");
		out.println("<form method = 'get' action = 'PrepopulateController'>");
		out.println("<input type = 'hidden' name = 'employeeId' value =" + employees.get(i).getId() + ">");
		out.println("<input type = 'submit' value = 'update'></td>");
		out.println("</form>");
		out.println("</td>");
		out.println("<td>");
		out.println("<form method = 'post' action = 'DeleteController'>");
		out.println("<input type = 'hidden' name = 'employeeId' value =" + employees.get(i).getId() + ">");
		out.println("<input type = 'submit' value = 'delete'></td>");
		out.println("</form>");
		out.println("</td>");
		out.println("</tr>");
	}
	%>
</table>
</body>
</html>