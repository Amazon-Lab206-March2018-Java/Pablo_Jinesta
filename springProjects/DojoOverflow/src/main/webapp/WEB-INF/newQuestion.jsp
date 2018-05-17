<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>New Question</title>
</head>
<body>
	<h1>What is your question?</h1>
	
	<form:form method="POST" action="/questions/new" modelAttribute="new_question">
	
		<p>
			<form:label path="question">Questions:
		    <form:errors path="question"/>
		    <form:textarea path="question"/></form:label>
	    </p>
	    
	    <p><c:out value="${error}"/></p>
	    <p>
			<label>Tags:
		    	<input type="text" name="tag_list"/>
		    </label>
	    </p>
	    
		<input type="submit" value="Submit"/>
		
	</form:form>
	
</body>
</html>