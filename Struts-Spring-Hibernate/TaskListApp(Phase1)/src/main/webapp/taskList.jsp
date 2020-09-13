<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>  
    <%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task List</title>
<sb:head/>
</head>
<body>
	<h1 class ="display-1" style = "text-align: center">TASK LIST</h1>
	
	<button id="userButton" onclick="window.location.href = 'userList'" class="btn btn-primary">USERS</button>
	<button onclick="window.location.href = 'logout'" class="btn btn-primary">LOGOUT</button>
	<button onclick="window.location.href = 'updateUser'" class="btn btn-primary">UPDATE USER</button>
	<br><br>
	
	<s:form action="addTask">
		<label class="label label-default">TITLE</label><span>  </span><s:textfield name = "title" theme="simple"></s:textfield>
		<s:submit value="ADD TASK" class="btn btn-primary" theme="simple"></s:submit>
	</s:form>
	<br>
	<s:form action="updateTask.do">
		<input type="hidden" name = "taskId" value="${taskId}">
		<label class="label label-default">TITLE</label><span>  </span><s:textfield name = "newTitle" label="Title" theme="simple"></s:textfield>
		<s:submit value="UPDATE TASK" class="btn btn-primary" theme="simple"></s:submit>
	</s:form>
	<br><br>
	<table class="table">
		 <thead class="thead-dark">
		<tr>
			<th>Title</th>
			<th>Date</th>
			<th>Done</th>
			<th>SubTasks</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		</thead>
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
					<s:submit value = "SUBTASKS" class="btn btn-primary"></s:submit>
				</s:form>
				</td>
				<td>
				<s:form action = "updateTask">
					<input type="hidden" name="taskId" value="${id}">
					<s:submit value = "UPDATE" class="btn btn-primary"></s:submit>
				</s:form>
				</td>
				<td>
				<s:form action = "deleteTask">
					<input type="hidden" name="taskId" value="${id}">
					<s:submit value = "DELETE" class="btn btn-primary" onclick="if (confirm('Are you sure you want to delete?')) form.action='deleteTask'; else return false;"></s:submit>
				</s:form>
				</td>
			</tr>
		</s:iterator>
	</table>
	
	<script type="text/javascript">
		var showUserButton = ${usersButtonShow};
		var userButton = document.getElementById("userButton");
		if (showUserButton == true) {
			userButton.style.display = "inline";
		  } else {
			  userButton.style.display = "none";
		  }
	</script>
	
</body>
</html>