<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>New License</title>
</head>
<body>

	<form:form method="POST" action="/licenses/new" modelAttribute="license">
	    <p>
	    
		    <form:label path="person">Person: 
		    <form:select path="person">
		    	<c:forEach var="person" items="${persons}"> 
		    		<option value="${person.id}">${person.firstName} ${person.lastName}</option>
		    	</c:forEach>
		    </form:select></form:label>
	    </p>
	    
	    <p>
		    <form:label path="state">State: 
		    <form:errors path="state"/>
		    <form:input path="state"/></form:label>
	    </p>
	    
	    <p>
		    <form:label path="expiration_date">Expiration Date (Firefox: mm-dd-yyy / Chrome: mm/dd/yyyy ): 
		    <form:errors path="expiration_date"/>
		    <form:input type="date" path="expiration_date"/></form:label>
	    </p>
	       
	    <input type="submit" value="Create"/>
	    
	</form:form>

</body>
</html>