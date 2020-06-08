<%@page import="javax.swing.text.DefaultEditorKit.CutAction"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.techlabs.sales.model.Merchant" %>
    <%@ page import="com.techlabs.sales.model.Customer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Checkout</title>
</head>
<body>
<button onclick = "window.location.href = 'shop.jsp'">Back to shop page</button>
<h2>Merchant Old table</h2>
<table border = "1">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Balance</th>
	</tr>
	<% 	
		out.println("<tr>");
		out.println("<td>" + ((Merchant)request.getAttribute("oldMerchant")).getId() + "</td>");
		out.println("<td>" + ((Merchant)request.getAttribute("oldMerchant")).getName() + "</td>");
		out.println("<td>" + ((Merchant)request.getAttribute("oldMerchant")).getBalance() + "</td>");
		out.println("</tr>");
	%>
</table>
<h2>Customer Old table</h2>
<table border = "1">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Balance</th>
	</tr>
	<% 	
		out.println("<tr>");
		out.println("<td>" + ((Customer)request.getAttribute("oldCustomer")).getId() + "</td>");
		out.println("<td>" + ((Customer)request.getAttribute("oldCustomer")).getName() + "</td>");
		out.println("<td>" + ((Customer)request.getAttribute("oldCustomer")).getBalance() + "</td>");
		out.println("</tr>");
	%>
</table>
<h2>Merchant New table</h2>
<table border = "1">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Balance</th>
	</tr>
	<% 	
		out.println("<tr>");
		out.println("<td>" + ((Merchant)request.getAttribute("newMerchant")).getId() + "</td>");
		out.println("<td>" + ((Merchant)request.getAttribute("newMerchant")).getName() + "</td>");
		out.println("<td>" + ((Merchant)request.getAttribute("newMerchant")).getBalance() + "</td>");
		out.println("</tr>");
	%>
</table>
<h2>Customer new table</h2>
<table border = "1">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Balance</th>
	</tr>
	<% 	
		out.println("<tr>");
		out.println("<td>" + ((Customer)request.getAttribute("newCustomer")).getId() + "</td>");
		out.println("<td>" + ((Customer)request.getAttribute("newCustomer")).getName() + "</td>");
		out.println("<td>" + ((Customer)request.getAttribute("newCustomer")).getBalance() + "</td>");
		out.println("</tr>");
	%>
</table>
</body>
</html>