<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Edit Language</title>
</head>
<body>
	<a href="/delete/${index}">Delete</a>
	<a href="/">Dashboard</a>

	<form:form method="POST" action="/edit/${id}" modelAttribute="language">
	    <p>
		    <form:label path="name">Name
		    <form:errors path="name"/>
		    <form:input path="name"/></form:label>
	    </p>
	    <p>    
		    <form:label path="creator">Creator
		    <form:errors path="creator"/>
		    <form:input path="creator"/></form:label>
	    </p>
	    <p>
	    <form:label path="currentVersion">Version
	    <form:errors path="currentVersion"/>
	    <form:input path="currentVersion"/></form:label>
	    </p>
	    	    
	    <input type="submit" value="Submit"/>
	</form:form>
	
</body>
</html>