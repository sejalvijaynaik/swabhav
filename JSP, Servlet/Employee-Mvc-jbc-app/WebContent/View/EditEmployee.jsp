<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add employee</title>
</head>
<body>
	<div class="container-fluid">
		<form action="editEmployee" method="post">
			<div class="form-inline">
				Id:<span>Name:<input type="text" class="form-control"
					name="id"
					value=<%=(request.getParameter("id") == null) ? "" : (request.getAttribute("id"))%>
					readonly="readonly"></span>
			</div>
			<div class="form-inline">
				Name:<input type="text" class="form-control" name="name"
					value=<%=(request.getAttribute("name") == null) ? "" : (request.getAttribute("name"))%>>
			</div>
			<div class="form-inline">
				Salary:<input type="number" class="form-control" name="salary"
					value=<%=(request.getAttribute("salary") == null) ? "" : (request.getAttribute("salary"))%>>
			</div>
			<div class="form-inline">
				Designation:<input type="number" class="form-control"
					name="designation"
					value=<%=(request.getAttribute("designation") == null) ? "" : (request.getAttribute("designation"))%>>
			</div>
			<div class="form-inline">
				<input type="submit" class="btn btn-primary" value="Update Employee">
			</div>
		</form>
		<h4 style="color: red;"><%=(request.getAttribute("message") == null) ? "" : (request.getAttribute("message"))%></h4>
	</div>
</body>
</html>