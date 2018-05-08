<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Current visit count</title>
</head>
<body>
<div id="main">
<p>You have visited <a href="http://127.0.0.1:8080/">localhost</a> <c:out value="${counter}"/> times.</p>
<p><a href="http://127.0.0.1:8080/">Test another visit?</a></p>
</div>
</body>
</html>