<%@page import="com.techlabs.employee.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.List" %>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact table</title>
</head>
<body>
<h2>Welcome Admin</h2>
Search Contact by Name :
<form method = "post" action = "searchEmployee">
 <input type = "text" name = "searchName">
<input type = "submit" value = "search">
</form>
<br><br>
<button onclick = "window.location.href = 'AddEmployee'">Add Employee</button>
<br><br>
<form method = "get" action = "logout">
<input type = "submit" value = "Logout">
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
	
		<c:forEach var="employee" items="${employees}">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.name}</td>
				<td>${employee.salary}</td>
				<td>${employee.designation}</td>
				<td>
					<c:url var = "updateLink" value="/updateEmployee">
						<c:param name="employeeId" value="${employee.id}"></c:param>
					</c:url>
					<input type="button" value="UPDATE" onclick="window.location.href='${updateLink}'">
				</td>
				<td>
					<c:url var = "deleteLink" value="/deleteEmployee">
						<c:param name="employeeId" value="${employee.id}"></c:param>
					</c:url>
					<input type="button" value="DELETE" onclick="if (confirm('Are you sure you want to delete?')) window.location.href='${deleteLink}'; else return false;">
				</td>
			</tr>
		</c:forEach>
	
</table>
<br><br>

</body>
</html>