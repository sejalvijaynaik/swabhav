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
<form method = "POST" action = "AdminUpdateController">
First Name : <input type = "text" name = "firstName" value = "${student.getFirstName()}"><br><br>
Last Name : <input type = "text" name = "lastName" value = "${student.getLastName()}"><br><br>
Address : <input type = "text" name = "address" value = "${student.getAddress()}"><br><br>
Date of Birth : <input type = "text" name = "dob" value = "${student.getDob()}"><br><br>
Cgpa : <input type = "text" name = "cgpa" value = "${student.getCgpa()}"><br><br>
<input type = "hidden" name = "ID" value = "${student.getId()}">
<input type = "submit" value = "Submit">
</form>
</body>
</html>
