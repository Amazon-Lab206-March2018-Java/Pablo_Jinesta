<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Dojo Page</title>
</head>
<body>
 	<h1><c:out value="${dojo.name}"/> Ninjas</h1>
 	<table border="1">
 		<thead>
 			<tr>
 				<th>First Name</th>
 				<th>Last Name</th>
 				<th>Age</th>
 			</tr>
 		</thead>
 		<c:forEach var="ninja" items="${dojo.ninjas}">
	 		<tr>
	 			<td><c:out value="${ninja.firstName}"/></td>
	 			<td><c:out value="${ninja.lastName}"/></td>
	 			<td><c:out value="${ninja.age}"/></td>
	 		</tr>
 		</c:forEach>
 	</table>
</body>
</html>