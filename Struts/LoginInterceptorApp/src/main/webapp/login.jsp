<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<s:head/>
<body>
<s:form action = "loginAction">
	<s:textfield name = "username" label = "Username"></s:textfield>
	<s:textfield name = "password" label = "Password"></s:textfield>
	<s:submit value = "Submit"></s:submit>
</s:form>
</body>
</html>