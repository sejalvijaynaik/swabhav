<%@ page import="java.util.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Beer Recommendations</title>
</head>
<body>
<h1>Beer Recommendations</h1>
<%
	List<String> beers = (List<String>)request.getAttribute("beers");
	Iterator<String> it = beers.iterator();
	while(it.hasNext()){
		out.println("<br>try : " + it.next());
	}
%>
</body>
</html>