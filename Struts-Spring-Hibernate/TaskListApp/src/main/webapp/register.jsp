<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register form</title>
<s:head/>
</head>
<body>
	<s:form action="register.do">
		<s:textfield name = "firstName" label="First Name"></s:textfield>
		<s:textfield name = "lastName" label="Last Name"></s:textfield>
		<s:textfield name = "email" label="Email"></s:textfield>
		<s:textfield name = "username" label="Username"></s:textfield>
		<s:textfield name = "password" label="Password"></s:textfield>
		<s:submit value = "Submit"></s:submit>
	</s:form>
</body>
</html>