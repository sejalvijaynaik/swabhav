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
<button onclick = "window.location.href = 'add.jsp'">Add Employee</button>
<h2>Employees Table</h2>
<table border = "1">
	<tr>
		<th>Employee Id</th>
		<th>Employee Name</th>
		<th>Employee Salary</th>
		<th>Employee Designation</th>
		<th>Update</th>
	</tr>
	<s:iterator value = "employees" var = "employee">
		<tr>
			<td><s:property value = "#employee.id"/></td>
			<td><s:property value = "#employee.name"/></td>
			<td><s:property value = "#employee.salary"/></td>
			<td><s:property value = "#employee.designation"/></td>
			<td>
				<s:form action = "prepopulateEmployeeAction">
					<s:hidden name = "employeeId" value = "#employee.id"></s:hidden>
					<s:submit value = "UPDATE"></s:submit>
				</s:form>
			</td>
		</tr>
	</s:iterator>
</table>
</body>
</html>