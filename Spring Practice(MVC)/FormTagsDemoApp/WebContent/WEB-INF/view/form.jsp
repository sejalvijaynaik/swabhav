<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form:form action="register" modelAttribute="student">
		First name : <form:input path="firstName"/><br><br>
		Last name : <form:input path="lastName"/><br><br>
		Country : 
		<form:select path="country">
			<form:options items="${student.countryOptions}"/>			
		</form:select><br><br>
		Favoutite language :
		<form:radiobuttons path="favLanguage" items="${student.favLanguageOptions}"/><br><br>
		Operating systems :
		Window<form:checkbox path="opSystems" value="Windows"/>
		MacOS<form:checkbox path="opSystems" value="MacOS"/>
		Android<form:checkbox path="opSystems" value="Android"/><br><br>
		<input type="submit" value="SUBMIT">
	</form:form>

</body>
</html>