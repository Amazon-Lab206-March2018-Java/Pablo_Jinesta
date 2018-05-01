
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Show Person Page</title>
</head>
<body>
	<h1>Hello World</h1>	
	
<%-- 	<% Person person = (Person) request.getAttribute("person"); %> --%>
	
<%-- 	<h1><%= person.greeting() %></h1> --%>
	
	<p>
        <c:out value="${person.greeting()}"/>
    </p>
</body>
</html>