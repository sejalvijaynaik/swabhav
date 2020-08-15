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
<form method = "POST" action = "addEmployeeAction">
<s:textfield name = "name" label = "Name : "></s:textfield><br><br>
<s:textfield name = "salary" label = "Salary : "></s:textfield><br><br>
<s:textfield name = "designation" label = "Designation : "></s:textfield><br><br>
<s:submit value = "SUBMIT"></s:submit>
</form>
</body>
</html>