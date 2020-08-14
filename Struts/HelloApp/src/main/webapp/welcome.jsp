<%@page import="org.apache.struts2.ServletActionContext"%>
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
<%
	for(int i = 1; i <= 10; i++){
		out.println("<h3>" + ServletActionContext.getRequest().getAttribute("myName") + "</h3>");
		out.println("<br>");
	}
%>
</body>
</html>