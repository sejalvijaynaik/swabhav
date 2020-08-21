<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
<style type="text/css">
	.error {
		color:red
	}
</style>
</head>
<body>
	<form:form action="register" modelAttribute="customer">
		First name(required) : <form:input path="firstName"/>
		<form:errors path="firstName" cssClass="error"></form:errors><br><br>
		Last name : <form:input path="lastName"/><br><br>
		<input type="submit" value="SUBMIT">
	</form:form>
</body>
</html>