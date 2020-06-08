<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shop</title>
</head>
<body>
<form action = "SalesTransactionController" method = "get">
Merchant Name : <input type = "text" name = "merchantName" required><br><br>
Customer id : <input type = "text" name = "customerId" required><br><br>
Amount : <input type = "text" name = "amount" required><br><br>
<input type = "submit" value = "submit">
</form>
</body>
</html>