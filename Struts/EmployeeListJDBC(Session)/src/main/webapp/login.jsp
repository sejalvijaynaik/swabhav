<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login form</title>
</head>
<body>
	<span style="color:red"><s:property value="message"/></span>
	<s:form action="loginAction">
			<s:textfield name="username" label="Username "></s:textfield>
			<s:textfield name="password" label="Pssword "></s:textfield>
			<s:submit value="Submit"></s:submit>
		</s:form>
</body>
</html>