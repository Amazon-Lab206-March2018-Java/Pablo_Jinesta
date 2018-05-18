<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Admin Page</title>
	
	<style type="text/css">
		<%@include file="css/skeleton.css" %>
		<%@include file="css/normalize.css" %>
		<%@include file="css/main.css"%>
	</style>
</head>
<body>
	<div class="container">
	    <h1>Welcome <c:out value="${currentUser.firstName}"></c:out> <span>(Admin)</span></h1>
	    
	    <table class="u-full-width">
	    	<thead>
	    	<tr>
	    		<th>Name</th>
	    		<th>Email</th>
	    		<th>Action</th>
	    	</tr>
	    	</thead>
	    	<tbody>
	 		<c:forEach var="user" items="${users}">   	
	    	<tr>
	    		<td><c:out value="${user.firstName}"/> <c:out value="${user.lastName}"/></td>
	    		<td><c:out value="${user.email}"/></td>
	    		<c:choose>
	    			<c:when test="${user.roles.contains(admin)}">
	    				<td>Is Admin</td>
	    			</c:when>
	    			<c:otherwise>
			    		<td><a href="/admin/delete/${user.id}">delete</a> 
			    		<a href="/admin/make-admin/${user.id}">make-admin</a></td>
	    			</c:otherwise>	
	    		</c:choose>   		
	    	</tr>
	 		</c:forEach>
	    	</tbody>
	    </table>
	     
	    <form id="logoutForm" method="POST" action="/logout">
	        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	        <input type="submit" value="Logout!" />
	    </form>
    </div>
</body>
</html>