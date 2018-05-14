<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Profile Page</title>
</head>
<body>
	<h1><c:out value="${license.getPerson().firstName} ${license.getPerson().lastName}"/></h1>
	<p>License Number: <c:out value="${license.number}"/></p>
	<p>State: <c:out value="${license.state}"/></p>
	<p>Expiration Date: <fmt:formatDate pattern="yyyy-MM-dd"  value="${license.expiration_date}"/></p>
</body>
</html>