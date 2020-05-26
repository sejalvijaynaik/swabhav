<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add employee form</title>
</head>
<body>
<%
if((session.getAttribute("username") == null)&&(session.getAttribute("password") == null)){
	response.sendRedirect("login.jsp");
}
%>
<h2>Add Employee</h2>
<form method = "POST" action = "AddEmployeeController">
Name : <input type = "text" name = "employeeName"><br><br>
Salary : <input type = "text" name = "employeeSalary"><br><br>
Designation : <input type = "text" name = "employeeDesignation"><br><br>
<input type = "submit" value = "Submit">
</form>

</body>
</html>