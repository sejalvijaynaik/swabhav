<%@ page import="com.techlabs.student.model.Student" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student form</title>
</head>
<body>
<h2>Update Student</h2>
<form method = "POST" action = "ProfessorUpdateController">
First Name : ${student.getFirstName()}<br>
Last Name : ${student.getLastName()}<br>
Address : ${student.getAddress()}<br>
Date of Birth : ${student.getDob()}<br>
Cgpa : <input type = "text" name = "cgpa" value = "${student.getCgpa()}"><br><br>
<input type = "hidden" name = "ID" value = "${student.getId()}">
<input type = "submit" value = "Submit">
</form>
</body>
</html>
