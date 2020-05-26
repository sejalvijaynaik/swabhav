<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="com.techlabs.employee.model.Employee"%>
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
			<th>Name</th>
			<th>Salary</th>
			<th>Designation</th>
		</tr>
		<%
	List<Employee> employees = (List<Employee>)request.getAttribute("searchEmployees");
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
<br><br>
<button onclick = "window.location.href = 'home.jsp'">Back to Login</button>
</body>
</html>