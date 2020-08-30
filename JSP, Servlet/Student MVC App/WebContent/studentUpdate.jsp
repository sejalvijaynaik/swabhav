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
<form method = "POST" action = "studentUpdate">
First Name : <input type = "text" name = "firstName" value = "${student.firstName}" required><br><br>
Last Name : <input type = "text" name = "lastName" value = "${student.lastName}" required><br><br>
Address : <input type = "text" name = "address" value = "${student.address}" required><br><br>
Date of Birth : <input type = "text" name = "dob" value = "${student.dob}" required><br><br>
<input type = "submit" value = "Submit">
</form>
</body>
</html>
