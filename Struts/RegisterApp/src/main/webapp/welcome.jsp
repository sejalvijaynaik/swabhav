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
<s:label value = "Fisrt Name: "></s:label>
<s:property value = "firstName"/><br>
<s:label value = "Last Name: "></s:label>
<s:property value = "lastName"/><br>
<s:label value = "Gender: "></s:label>
<s:property value = "gender"/><br>
<s:label value = "Age: "></s:label>
<s:property value = "age"/><br>
<s:label value = "Email: "></s:label>
<s:property value = "email"/><br>
</body>
</html>