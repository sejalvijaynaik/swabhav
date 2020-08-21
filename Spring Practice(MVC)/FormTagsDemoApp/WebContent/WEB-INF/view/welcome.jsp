<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<h1>Thanks for registration :</h1>
	<h2>First Name : ${student.firstName}</h2>
	<h2>Last Name : ${student.lastName}</h2>
	<h2>Country code : ${student.country}</h2>
	<h2>Favourite Language : ${student.favLanguage}</h2>
	<h2>Operating Systems:</h2>
	<ul>
		<c:forEach var="tempOpSystem" items="${student.opSystems}">
			<li>${tempOpSystem}</li>
		</c:forEach>
	</ul>

	
</body>
</html>