<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><c:out value="${team.getTeamName()}"/>: New Player</title>
</head>
<body>

	<h2>Add a player to team "<c:out value="${team.getTeamName()}"/>"</h2>
	<form action="players" method="POST">
		<label for="firstname">First Name:</label>
	    <input type="text" name="firstname" id="firstname">
	    
	    <label for="lastname">Last Name:</label>
	    <input type="text" name="lastname" id="lastname">
	    
	    <label for="age">Age:</label>
	    <input type="number" name="age" id="age">
	    
	    <input type="submit" value="Add">
	    
	</form>

</body>
</html>