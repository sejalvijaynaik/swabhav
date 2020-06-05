<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee Form</title>
</head>
<body>
<h2>Employee Update Form</h2>
<form method = "POST" action = "UpdateController">
Name : <input type = "text" name = "name" value = "${employee.getName()}"><br><br>
Salary : <input type = "text" name = "salary" value = "${employee.getSalary()}"><br><br>
Designation : <input type = "text" name = "designation" value = "${employee.getDesignation()}"><br><br>
<input type = "hidden" name = "ID" value = "${employee.getId()}">
<input type = "submit" value = "Submit">
</form>
</body>
</html>