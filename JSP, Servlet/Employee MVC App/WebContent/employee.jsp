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
<h2>Welcome Admin</h2>
<%
	if((session.getAttribute("username") == null)&&(session.getAttribute("password") == null)){
		response.sendRedirect("login.jsp");
	}
%>
Search Employee by Name :
<form method = "post" action = "searcgEmployeeController">
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
		out.println("<form method = 'post' action = 'PrepopulateEmployeeController'>");
		out.println("<input type = 'hidden' name = 'employeeId' value =" + employees.get(i).getId() + ">");
		out.println("<input type = 'submit' value = 'update'></td>");
		out.println("</form>");
		out.println("</td>");
		out.println("<td>");
		out.println("<form method = 'post' action = 'DeleteEmployeeController'>");
		out.println("<input type = 'hidden' name = 'employeeId' value =" + employees.get(i).getId() + ">");
		out.println("<input type = 'submit' value = 'delete'></td>");
		out.println("</form>");
		out.println("</td>");
		out.println("</tr>");
	}
	%>
</table>
<br><br>
<button onclick = "window.location.href = 'add.jsp'">Add Employee</button>
<br><br>
<form method = "get" action = "LogoutController">
<input type = "submit" value = "Logout">
</form>
</body>
</html>