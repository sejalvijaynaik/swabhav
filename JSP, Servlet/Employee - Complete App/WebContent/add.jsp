<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add employee form</title>
</head>
<body>
<h2>Add Employee</h2>
<form method = "POST" action = "AddEmployee">
Name : <input type = "text" name = "name" value="${name}" required><br><br>
Salary : <input type = "text" name = "salary" value="${salary}" required><br><br>
Designation : <input type = "text" name = "designation" value="${designation}" required><br><br>
<input type = "submit" value = "Submit">
</form>
</body>
</html>