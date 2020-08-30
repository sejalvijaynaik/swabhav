<%@ page import="com.techlabs.model.Student" %>
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
<form method = "POST" action = "professorUpdate">
First Name : ${student.firstName}<br>
Last Name : ${student.lastName}<br>
Address : ${student.address}<br>
Date of Birth : ${student.dob}<br>
CGPA : <input type = "text" name = "cgpa" value = "${cgpa}"><br><br>
<input type = "submit" value = "Submit">
</form>
</body>
</html>
