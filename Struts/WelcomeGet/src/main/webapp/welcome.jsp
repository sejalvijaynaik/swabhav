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
<s:property value = "myName"/>
<%
	for(int i = 1; i < 10; i++){
		out.println(request.getAttribute("myName"));
	}
%>
</body>
</html>