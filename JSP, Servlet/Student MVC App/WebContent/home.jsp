<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

	<input type="button" value="ADMIN" onclick = "window.location.href = 'adminLogin'">
	<input type="button" value="PROFESSOR" onclick = "window.location.href = 'professorLogin'">
	<input type="button" value="STUDENT" onclick = "window.location.href = 'studentLogin'">

</body>
</html>