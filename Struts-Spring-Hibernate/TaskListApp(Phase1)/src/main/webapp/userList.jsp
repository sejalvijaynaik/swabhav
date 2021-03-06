<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>  
    <%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
<sb:head/>
<style type="text/css">
	img {
	  max-width: 100%;
	  height: auto;
	}
</style>
</head>
<body>

	<h1 class ="display-1" style = "text-align: center">USER LIST</h1>
	
	<button onclick="window.location.href = 'logout'" class="btn btn-primary">LOGOUT</button>
	<button onclick="window.location.href = 'register'" class="btn btn-primary">ADD USER</button>
	<br><br>
	<table class="table">
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Username</th>
			<th>Password</th>
			<th>Tasks</th>
			<th>Update</th>
			<th>Delete</th>
			<th>Locked</th>
			<th>Image</th>
		</tr>
		<s:iterator value="users">
			<tr>
				<td><s:property value="id"/></td>
				<td><s:property value="firstName"/></td>
				<td><s:property value="lastName"/></td>
				<td><s:property value="email"/></td>
				<td><s:property value="username"/></td>
				<td><s:property value="password"/></td>
				<td>
				<s:form action = "taskList">
					<input type="hidden" name="userId" value="${id}">
					<s:submit value = "TASKS" class="btn btn-primary"></s:submit>
				</s:form>
				</td>
				<td>
				<s:form action = "updateUser">
					<input type="hidden" name="userId" value="${id}">
					<s:submit value = "UPDATE" class="btn btn-primary"></s:submit>
				</s:form>
				</td>
				<td>
				<s:form action = "deleteUser">
					<input type="hidden" name="userId" value="${id}">
					<s:submit value = "DELETE" class="btn btn-primary" onclick="if (confirm('Are you sure you want to delete?')) form.action='deleteUser'; else return false;"></s:submit>
				</s:form>
				</td>
				<td>
					<s:url var="updateUserLockLink" value="/updateUserLock">
						<s:param name="userId" value="%{id}"></s:param>
					</s:url>					
					<s:if test="locked == true">
						<button class="btn btn-primary" style = "background-color:red" onclick="window.location.href='${updateUserLockLink}'">YES</button>
					</s:if>
					<s:else>
						<button class="btn btn-primary" style = "background-color:green" onclick="window.location.href='${updateUserLockLink}'">NO</button>
					</s:else>
				
				</td>
				<td>
					<s:url var="displayImageLink" value="/displayImage">
						<s:param name="userId" value="%{id}"></s:param>
					</s:url>
					<img width="100" height="100" src="${displayImageLink}">
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>