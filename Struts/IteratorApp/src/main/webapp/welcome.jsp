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
<table border = "1">
	<tr>
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Product Price</th>
	</tr>
	<s:iterator value = "products" var = "product">
		<tr>
			<td><s:property value = "#product.id"/></td>
			<td><s:property value = "#product.name"/></td>
			<td><s:property value = "#product.price"/></td>
		</tr>
	</s:iterator>
</table>
</body>
</html>