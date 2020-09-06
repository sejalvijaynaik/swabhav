<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
</head>
<body>
	<s:form action="register">
		<s:submit value="ADD USER" theme="simple"></s:submit>
	</s:form>
	
	
	<h2>User List</h2>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Username</th>
			<th>Password</th>
			<th>Update</th>
			
		</tr>
		<s:iterator value="users">
			<tr>
				<td><s:property value="id"/></td>
				<td><s:property value="firstName"/></td>
				<td><s:property value="lastName"/></td>
				<td><s:property value="email"/></td>
				<td><s:property value="username"/></td>
				<td><s:property value="password"/></td>
				<td>
				<s:form action = "updateUser">
					<input type="hidden" name="userId" value="${id}">
					<s:submit value = "UPDATE"></s:submit>
				</s:form>
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>