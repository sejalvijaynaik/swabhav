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
	<h1>Welcome ${username}</h1>
	<s:a href="logout">LOGOUT</s:a>
	<s:property value="user.username"/>
</body>
</html>