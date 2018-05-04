<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Make a pet!</title>
</head>
<body>

	<div id="dog">
	
		<p>Create a dog</p>
		
		<form action="dog" method="POST">
		
			<label for="name">Name:</label>
		    <input type="text" name="name">
		    
		    <label for="breed">Breed:</label>
		    <input type="text" name="breed">
		    
		    <label for="weight">Weight (lbs):</label>
		    <input type="text" name="weight">
		    
		    <input type="submit" value="Create Dog">
		    
		</form>
		
	</div>
	
	<div id="dog">
	
		<p>Create a cat</p>
		
		<form action="cat" method="POST">
		
			<label for="name">Name:</label>
		    <input type="text" name="name">
		    
		    <label for="breed">Breed:</label>
		    <input type="text" name="breed">
		    
		    <label for="weight">Weight (lbs):</label>
		    <input type="text" name="weight">
		    
		    <input type="submit" value="Create Cat">
		    
		</form>
		
	</div>

</body>
</html>