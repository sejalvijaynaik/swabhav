<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter your name here</h1>
<s:form action = "welcomeAction" method = "get">
<s:textfield name = "myName"></s:textfield>
<s:submit value = "submit"></s:submit>
</s:form>
</body>
</html>