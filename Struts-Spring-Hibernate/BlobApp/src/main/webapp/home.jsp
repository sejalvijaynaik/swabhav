<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>
</head>
<body>
	<form action = "upload" method = "post" enctype = "multipart/form-data">
	    NAME : <input type = "text" name = "name" /><br><br>
	    UPLOAD : <input type = "file" name = "imageFile" /><br><br>
	    <input type = "submit" value = "Upload"/>
	</form>
</body>
</html>