<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Dashboard</title>
	<style type="text/css">
		<%@include file="css/skeleton.css" %>
		<%@include file="css/normalize.css" %>
		<%@include file="css/main.css"%>
	</style>
</head>
<body>
	<div class="container">
	
	    <h1>Welcome <c:out value="${currentUser.firstName}"></c:out>!</h1>
	    <h6><a href="/admin">Admin Dashboard</a></h6>
	    
	    <div id="user-info">
	    	<p>First Name: <c:out value="${currentUser.firstName}"></c:out></p>
	    	<p>Last Name: <c:out value="${currentUser.lastName}"></c:out></p>
	    	<p>Email: <c:out value="${currentUser.email}"></c:out></p>
	    	<p>Sign up date: <fmt:formatDate pattern="MM/dd/yyyy HH:mm:ss" value="${currentUser.createdAt}"/></p>    	
	    	<p>Last Sign in: <fmt:formatDate pattern="MM/dd/yyyy HH:mm:ss" value="${currentUser.lastSignIn}"/></p>    	
	    </div>
	    
	    <form id="logoutForm" method="POST" action="/logout">
	        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	        <input class="button-primary" type="submit" value="Logout!" />
	    </form>
	    
    </div>
</body>
</html>