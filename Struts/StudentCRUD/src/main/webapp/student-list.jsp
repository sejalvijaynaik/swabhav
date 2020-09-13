<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
<sb:head/>
</head>
<body>

	<h1 class ="display-1" style = "text-align: center">STUDENT LIST</h1>
	
	<button id="userButton" onclick="window.location.href = 'logout'" class="btn btn-primary">LOGOUT</button>
	<button id="userButton" onclick="window.location.href = 'add'" class="btn btn-primary">ADD STUDENT</button>
	<br><br>
	<table class="table">
		 <thead class="thead-dark">
			<tr>
				<th>Roll No</th>
				<th>Name</th>
				<th>Address</th>
				<th>Age</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
		</thead>
		<s:iterator value="students">
			<tr>
				<td><s:property value="rollNo"/></td>
				<td><s:property value="name"/></td>
				<td><s:property value="address"/></td>
				<td><s:property value="age"/></td>
				<td>
				<s:form action = "update">
					<input type="hidden" name="rollNo" value="${rollNo}">
					<s:submit value = "UPDATE" class="btn btn-primary"></s:submit>
				</s:form>
				</td>
				<td>
				<s:form action = "delete">
					<input type="hidden" name="rollNo" value="${rollNo}">
					<s:submit value = "DELETE" class="btn btn-primary" onclick="if (confirm('Are you sure you want to delete?')) form.action='delete'; else return false;"></s:submit>
				</s:form>
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>