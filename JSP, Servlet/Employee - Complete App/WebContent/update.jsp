 <%@ page import="com.techlabs.employee.model.Employee" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update form</title>
</head>
<body>
<h2>Update Employee</h2>
<form method = "POST" action = "updateEmployee">
Name : <input type = "text" name = "name" value = "${name}" required><br><br>
Salary : <input type = "text" name = "salary" value = "${salary}" required><br><br>
Designation : <input type = "text" name = "designation" value = "${designation}" required><br><br>
<input type = "submit" value = "Submit">
</form>
</body>
</html>