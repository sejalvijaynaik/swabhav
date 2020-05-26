<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.List" %>
  <%@ page import="com.techlabs.employee.model.Employee" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee table</title>
</head>
<body>
Search Employee by Name :
<form method = "post" action = "GuestSerachEmployeeComtroller">
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
<br><br>
<form method = "get" action = "home.jsp">
<input type = "submit" value = "Back to Login">
</form>
</body>
</html>