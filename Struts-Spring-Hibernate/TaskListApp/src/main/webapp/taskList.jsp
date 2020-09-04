<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task List</title>
</head>
<body>
	<s:form action="addTask">
		<s:submit value="ADD TASK"></s:submit>
	</s:form>
	<h2>Task List</h2>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Date</th>
			<th>Done</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<s:iterator value="tasks">
			<tr>
				<td><s:property value="id"/></td>
				<td><s:property value="title"/></td>
				<td><s:property value="date"/></td>
				<td><s:property value="done"/></td>
				<td>
				<s:form action = "update">
					<input type="hidden" name="rollNo" value="${id}">
					<s:submit value = "UPDATE"></s:submit>
				</s:form>
				</td>
				<td>
				<s:form action = "delete">
					<input type="hidden" name="rollNo" value="${id}">
					<s:submit value = "DELETE" onclick="if (confirm('Are you sure you want to delete?')) form.action='delete'; else return false;"></s:submit>
				</s:form>
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>