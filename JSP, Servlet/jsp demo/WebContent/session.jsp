<html>
<head>
<title>Session Practice</title>
</head>

<body>

<% 
String oldValue = "0";
String newValue ="1";

if((session.getAttribute("oldValue") == null)&&(session.getAttribute("newValue") == null)){
	session.setAttribute("oldValue", oldValue);
	session.setAttribute("newValue", newValue);
}

else{
	oldValue = (String)(session.getAttribute("oldValue"));
	newValue = (String)(session.getAttribute("newValue"));
	int oldValueInInt = Integer.parseInt(oldValue) + 1;
	int newVlaueInInt = Integer.parseInt(newValue) + 1;
	oldValue = String.valueOf(oldValueInInt);
	newValue = String.valueOf(newVlaueInInt);
	session.setAttribute("oldValue", oldValue);
	session.setAttribute("newValue", newValue);
}

out.println("Old Value :" + session.getAttribute("oldValue"));
out.println("New Value :" + session.getAttribute("newValue"));
out.print(" Session Id : " + session.getId());

%>
<a href = "summary.jsp">Back</a>

</body>

