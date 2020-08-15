<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee Form</title>
</head>
<body>
<h2>Add Contact</h2>
<form method = "POST" action = "updateEmployeeAction">
	<s:textfield name = "name" label = "Name : " value = "%{employee.name}"></s:textfield><br><br>
	<s:textfield name = "salary" label = "Salary : " value = "%{employee.salary}"></s:textfield><br><br>
	<s:textfield name = "designation" label = "Designation : " value = "%{employee.designation}"></s:textfield><br><br>
	<s:hidden name = "employeeId" value = "%{employee.id}"></s:hidden>
	<s:submit value = "SUBMIT"></s:submit>
</form>
</body>
</html>