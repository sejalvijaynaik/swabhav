<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<s:head/>
</head>
<body>
<s:form action = "resgisterAction">
	<s:textfield name = "myName"></s:textfield>
	<s:submit value = "Submit"></s:submit>
</s:form>
</body>
</html>