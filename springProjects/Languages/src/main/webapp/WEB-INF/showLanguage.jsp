<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Language: <c:out value="${language.name}"/></title>
</head>
<body>
	<a href="/">Dashboard</a>
	<p>Name: <c:out value="${language.name}"/></p>
	<p>Creator: <c:out value="${language.creator}"/></p>
	<p>Version: <c:out value="${language.currentVersion}"/></p>
	<p>Created at: <c:out value="${language.createdAt}"/></p>
	<a href="/edit/${language.id}">Edit</a>
	<a href="/delete/${language.id}">Delete</a>
</body>
</html>