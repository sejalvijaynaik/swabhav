<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<sb:head/>
<style>
	.bg {
  /* The image used */
  background-image: url(images/to-do-image.jpg);

  /* Full height */
  height: 100%;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
</head>
<body class="bg">
		
		<nav class="navbar navbar-default">
	  		<div class="container-fluid">
				<div class="navbar-header">
				    <a class="navbar-brand" href="home">TASKLISTAPP</a>
				</div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="home">HOME</a></li>
				    <li><a href="login">LOGIN</a></li>
				    <li><a href="register">REGISTER</a></li>
				</ul>
	 		</div>
		</nav>
		<h1 class ="display-1" style = "text-align: center; color:clack; border-width:thick"><span style="background-color: white">TASK LIST APP</span></h1>
</body>
</html>