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

<s:label value = "Address: "></s:label>
<s:property value = "address"/><br>

<s:label value = "Favourite Color: "></s:label>
<s:property value = "selectedColor"/><br>

<s:if test = "%{subscription == true}">
	<div>You are a subscriber</div>
</s:if>
<s:else>
	<div>You are not a subscriber</div>
</s:else>

</body>
</html>