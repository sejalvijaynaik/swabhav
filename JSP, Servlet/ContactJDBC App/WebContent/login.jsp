<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<form action = "login" method = "POST">
		<div class="form-group">
			<label>Username</label>
			<input type = "text" class="form-control" name = "username" required>
		</div>
		<div class="form-group">
			<label>Password</label>
			<input type = "password" class="form-control" name = "password" required>
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</body>
</html>