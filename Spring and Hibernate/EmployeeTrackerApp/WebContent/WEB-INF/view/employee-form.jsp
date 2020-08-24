<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
</head>
<body>
	<h2>Employee Form</h2>

	<form:form action="addOrUpdate" modelAttribute="employee" method="post">
		<form:hidden path="id"/>
		<label>Name : </label>
		<form:input path="name"/><br><br>
		<label>Salary : </label>
		<form:input path="salary"/><br><br>
		<label>Designation : </label>
		<form:input path="designation"/><br><br>
		<input type="submit" value="SUBMIT"/>
	</form:form>

</body>
</html>