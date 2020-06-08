<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.techlabs.model.employee.Employee" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>
<table border = "1">
	<tr>
		<th>Empno</th>
		<th>Ename</th>
		<th>Job</th>
		<th>Mgr</th>
		<th>Hiredate</th>
		<th>Salary</th>
		<th>Comm</th>
		<th>Deptno</th>
	</tr>
	<%
	List<Employee> employees = (List<Employee>)request.getAttribute("employees");
	for(int i = 0; i < employees.size(); i++){
		out.println("<tr>");
		out.println("<td>" + employees.get(i).getEmpno() + "</td>");
		out.println("<td>" + employees.get(i).getEname() + "</td>");
		out.println("<td>" + employees.get(i).getJob() + "</td>");
		out.println("<td>" + employees.get(i).getMgr() + "</td>");
		out.println("<td>" + employees.get(i).getHiredate() + "</td>");
		out.println("<td>" + employees.get(i).getSalary() + "</td>");
		out.println("<td>" + employees.get(i).getComm() + "</td>");
		out.println("<td>" + employees.get(i).getDeptno() + "</td>");
		out.println("</tr>");
	}
	%>
</table>
</body>
</html>