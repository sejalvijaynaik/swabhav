<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %> 
    <%@ page import = "java.io.*,java.util.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome<s:property value = "message"></s:property></h1>
<%
Date date = new Date();
out.print(date.toString());
%>
</body>
</html>