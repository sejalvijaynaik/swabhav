<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h2>Employees Table</h2>
<table border = "1">
	<tr>
		<th>Employee Id</th>
		<th>Employee Name</th>
		<th>Employee Salary</th>
		<th>Employee Designation</th>
	</tr>
	<s:iterator value = "employees" var = "employee">
		<tr>
			<td><s:property value = "#employee.id"/></td>
			<td><s:property value = "#employee.name"/></td>
			<td><s:property value = "#employee.salary"/></td>
			<td><s:property value = "#employee.designation"/></td>
		</tr>
	</s:iterator>
</table>
<s:a href="logoutAction">LOGOUT</s:a>
</body>
</html>