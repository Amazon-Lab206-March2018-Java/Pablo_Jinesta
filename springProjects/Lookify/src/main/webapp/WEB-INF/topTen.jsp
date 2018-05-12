<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Search</title>
</head>
<body>
	<p>Top Ten Songs:</p>
	<a href="/dashboard">Dashboard</a>
	<div>
		<c:forEach items="${songs}" var="song" >
		<p>
		    <c:out value="${song.rating}"/> - 
		    <a href="/songs/${song.id}"><c:out value="${song.title}"/></a> -
			<c:out value="${song.artist}"/>
		</p>
		</c:forEach>
	</div>
</body>
</html>