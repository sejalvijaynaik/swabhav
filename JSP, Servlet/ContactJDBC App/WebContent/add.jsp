<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add contact form</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<h3 class="display-4" style = "text-align: center">ADD CONTACT</h3>
	
	<form method="post" action="AddContact">
	
	  <div class="form-group row">
	    <label class="col-sm-2 col-form-label">First Name</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name = "firstName" value="${firstName}" required>
	    </div>
	  </div>
	  
	   <div class="form-group row">
	    <label class="col-sm-2 col-form-label">Last Name</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name = "lastName" value="${lastName}" required>
	    </div>
	  </div>
	  
	  <div class="form-group row">
	    <label class="col-sm-2 col-form-label">Number</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name = "number" value="${number}" required>
	    </div>
	  </div>
	  
	  <div class="form-group row">
	    <label class="col-sm-2 col-form-label">Email</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name = "email" value="${email}" required>
	    </div>
	  </div>
	  
	  <div class="form-group row">
	    <div class="col-sm-10">
	      <button type="submit" class="btn btn-primary">Submit</button>
	    </div>
  	  </div>
  	  
  	</form>
 
</body>
</html>