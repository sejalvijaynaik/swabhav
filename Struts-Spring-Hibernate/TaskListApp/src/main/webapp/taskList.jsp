<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task List</title>
</head>
<body>
	
	<button id="userButton" onclick="window.location.href = 'userList'" value="USERS">USERS</button>
	
	<s:form action="logout">
		<s:submit value="LOGOUT" theme="simple"></s:submit>
	</s:form>
	
	<s:form action="updateUser">
		<s:submit value="UPDATE USER" theme="simple"></s:submit>
	</s:form>
	
	<s:form action="addTask">
		<s:textfield name = "title" label="Title" theme="simple"></s:textfield>
		<s:submit value="ADD TASK" theme="simple"></s:submit>
	</s:form>
	
	<s:form action="updateTask.do">
		<input type="hidden" name = "taskId" value="${taskId}">
		Title : <s:textfield name = "newTitle" theme="simple"></s:textfield>
		<s:submit value="UPDATE" theme="simple"></s:submit>
	</s:form>
	
	<h2>Task List</h2>

	<table border="1">
		<tr>
			<th>Title</th>
			<th>Date</th>
			<th>Done</th>
			<th>SubTasks</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<s:iterator value="tasks">
			<tr>
				<td>
					<s:if test="done == true">
						<span style="text-decoration: line-through"><s:property value="title" /></span>
					</s:if>
					<s:else>
						<s:property value="title" />
					</s:else>
				</td>
				<td><s:property value="date"/></td>
				<td>
					<s:url var="updateTaskDoneLink" value="/updateTaskDone">
						<s:param name="taskId" value="%{id}"></s:param>
					</s:url>
					<s:checkbox name = "done" theme="simple" onclick="window.location.href='%{updateTaskDoneLink}'"></s:checkbox>
				</td>
				<td>
				<s:form action = "subTaskList">
					<input type="hidden" name="taskId" value="${id}">
					<s:submit value = "SUBTASKS"></s:submit>
				</s:form>
				</td>
				<td>
				<s:form action = "updateTask">
					<input type="hidden" name="taskId" value="${id}">
					<s:submit value = "UPDATE"></s:submit>
				</s:form>
				</td>
				<td>
				<s:form action = "deleteTask">
					<input type="hidden" name="taskId" value="${id}">
					<s:submit value = "DELETE" onclick="if (confirm('Are you sure you want to delete?')) form.action='deleteTask'; else return false;"></s:submit>
				</s:form>
				</td>
			</tr>
		</s:iterator>
	</table>
	
	<script type="text/javascript">
		var showUserButton = ${usersButtonShow};
		var userButton = document.getElementById("userButton");
		if (showUserButton == true) {
			userButton.style.display = "block";
		  } else {
			  userButton.style.display = "none";
		  }
	</script>
	
</body>
</html>