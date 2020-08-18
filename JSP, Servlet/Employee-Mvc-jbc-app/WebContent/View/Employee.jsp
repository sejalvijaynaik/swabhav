<%@page import="java.util.ArrayList"%>
<%@page import="com.techlab.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 class="jumbotron">Employee</h1>
	<br>
	<a href="addEmployee">Add</a>
	<div class="container-fluid">
		<table class="table table-hover">
			<tr>
			<thead>
				<th>Id</th>
				<th>Name</th>
				<th>Salary</th>
				<th>Designation</th>
			</thead>
			</tr>
			<tbody>

				<%
					List<Employee> emps = (ArrayList<Employee>) request.getAttribute("employees");
					for (Employee item : emps) {
				%>
				<tr>
					<td><%=item.getId()%></td>
					<td><%=item.getName()%></td>
					<td><%=item.getSalary()%></td>
					<td><%=item.getDesignation()%></td>
					<td><a class="btn btn-primary"
						href=<%="editEmployee?id=" + item.getId()%>>Edit</a></td>
						<td><a class="btn btn-primary" href=<%="deleteEmployee?id="+item.getId() %>>Delete</a></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</div>

</body>
</html>