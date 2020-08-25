<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
</head>
<body>
	
	<s:form action="add.do" method="get">
		<s:submit value="ADD STUDENT"></s:submit>
	</s:form>

	<h2>Student List</h2>
	<table border="1">
		<tr>
			<th>Roll No</th>
			<th>Name</th>
			<th>Address</th>
			<th>Age</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<s:iterator value="students">
			<tr>
				<td><s:property value="rollNo"/></td>
				<td><s:property value="name"/></td>
				<td><s:property value="address"/></td>
				<td><s:property value="age"/></td>
				<td>
				<s:form action = "update.do" method="get">
					<input type="hidden" name="rollNo" value="${rollNo}">
					<s:submit value = "UPDATE"></s:submit>
				</s:form>
				</td>
				<td>
				<s:form action = "delete">
					<input type="hidden" name="rollNo" value="${rollNo}">
					<s:submit value = "DELETE" onclick="if (confirm('Are you sure you want to delete?')) form.action='delete'; else return false;"></s:submit>
				</s:form>
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>