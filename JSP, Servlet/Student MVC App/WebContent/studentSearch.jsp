<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.List" %>
  <%@ page import="com.techlabs.model.Student" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student table</title>
</head>
<body>
<h2>Welcome Student</h2>
Search Student by Name :
<form method = "get" action = "StudentSearchController">
	<input type = "text" name = "searchName">
	<input type = "submit" value = "search">
</form>
<br>
<form method = "get" action = "LogoutController">
	<input type = "submit" value = "Logout">
</form>
<br>
<form method = "get" action = "StudentPrepopulateController">
	<input type = "submit" value = "Update">
</form>
<br><br>
<table border = "1">
	<tr>
		<th>ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Address</th>
		<th>Date of Birth</th>
		<th>Cgpa</th>
	</tr>
	<%
	List<Student> students = (List<Student>)request.getAttribute("searchStudents");
	for(int i = 0; i < students.size(); i++){
		out.println("<tr>");
		out.println("<td>" + students.get(i).getId() + "</td>");
		out.println("<td>" + students.get(i).getFirstName() + "</td>");
		out.println("<td>" + students.get(i).getLastName() + "</td>");
		out.println("<td>" + students.get(i).getAddress() + "</td>");
		out.println("<td>" + students.get(i).getDob() + "</td>");
		out.println("<td>" + students.get(i).getCgpa() + "</td>");
		out.println("</tr>");
	}
	%>
</table>
</body>
</html>