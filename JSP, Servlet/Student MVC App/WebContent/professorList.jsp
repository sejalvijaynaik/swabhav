<%@page import="com.techlabs.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.List" %>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students table</title>
</head>
<body>
<h2>Welcome Admin</h2>
Search Student by Name :
<form method = "post" action = "professorSearchStudent">
 <input type = "text" name = "searchName">
<input type = "submit" value = "search">
</form>
<br><br>
<form method = "get" action = "logout">
<input type = "submit" value = "Logout">
</form>
<br><br>
<table border = "1">
	<tr>
		<th>ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Address</th>
		<th>DOB</th>
		<th>CGPA</th>
		<th>Update</th>
	</tr>
	
		<c:forEach var="student" items="${students}">
			<tr>
				<td>${student.id}</td>
				<td>${student.firstName}</td>
				<td>${student.lastName}</td>
				<td>${student.address}</td>
				<td>${student.dob}</td>
				<td>${student.cgpa}</td>
				<td>
					<c:url var = "updateCgpaLink" value="/professorUpdate">
						<c:param name="studentId" value="${student.id}"></c:param>
					</c:url>
					<input type="button" value="UPDATE CGPA" onclick="window.location.href='${updateCgpaLink}'">
				</td>
			</tr>
		</c:forEach>
	
</table>
<br><br>

</body>
</html>