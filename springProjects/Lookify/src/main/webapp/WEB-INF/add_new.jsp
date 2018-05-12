<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Song</title>
</head>
<body>
	<a href="/dashboard">Dashboard</a>
	<div>
		<form:form method="POST" action="add_new" modelAttribute="song">
		    <form:label path="title">Title
		    <form:errors path="title"/>
		    <form:input path="title"/></form:label>
		    
		    <form:label path="artist">Artist
		    <form:errors path="artist"/>
		    <form:input path="artist"/></form:label>
		    
		    <form:label path="rating">Rating (1-10)
		    <form:errors path="rating"/>
		    <form:input type="number" max="10" path="rating"/></form:label>
		    	    
		    <input type="submit" value="Add Song"/>
		</form:form>
	</div>
</body>
</html>