<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of employees</title>
</head>
<body>

	<input type="button" value="Add Employee" onclick="window.location.href='addForm'">
	
	<form:form action="search" method="get">
		<input type="text" name="searchName">
		<input type="submit" value="SEARCH">
	</form:form>
	
	<h2>List of employees</h2>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Designation</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		
			<c:forEach var="tempEmployee" items="${employees}">
				<tr>
					<td>${tempEmployee.id}</td>
					<td>${tempEmployee.name}</td>
					<td>${tempEmployee.salary}</td>
					<td>${tempEmployee.designation}</td>
					<td>
						<c:url var = "updateLink" value="/employee/updateForm">
							<c:param name="employeeId" value="${tempEmployee.id}"></c:param>
						</c:url>
						<input type="button" value="UPDATE" onclick="window.location.href='${updateLink}'">
					</td>
					<td>
						<c:url var = "deleteLink" value="/employee/delete">
							<c:param name="employeeId" value="${tempEmployee.id}"></c:param>
						</c:url>
						<input type="button" value="DELETE" onclick="if (confirm('Are you sure you want to delete?')) window.location.href='${deleteLink}'; else return false;">
					</td>
			</tr>
			</c:forEach>
		
	</table>
</body>
</html>