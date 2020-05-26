<%@page import="com.techlabs.employee.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
if((session.getAttribute("username") == null)&&(session.getAttribute("password") == null)){
	response.sendRedirect("login.jsp");
}
%>
<h2>Update Employee</h2>
<form method = "POST" action = "UpdateEmployeeController">
Name : <input type = "text" name = "employeeName" value = "${employee.getName()}"><br><br>
Salary : <input type = "text" name = "employeeSalary" value = "${employee.getSalary()}"><br><br>
Designation : <input type = "text" name = "employeeDesignation" value = "${employee.getDesignation()}"><br><br>
<input type = "hidden" name = "employeeID" value = "${employee.getId()}">
<input type = "submit" value = "Submit">
</form>

</body>
</html>