<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table style="width: 90%; text-align: center;">
			<thead>
				<tr style="background-color: #E0E0E1;">
					<th>ID</th>
					<th>NAME</th>
					<th>Image</th>
				</tr>
			</thead>
				<tr>
					<td>
						<s:property value="person.id" />
					</td>
					<td>
						<s:property value="person.name" />
					</td>
					<td>
						<img width="100" height="100" src="<s:url value='displayImage.action?id='/><s:property value='person.id' />">
					</td>
				</tr>
		</table>
</body>
</html>