<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Random Word Generator</title>
</head>
<body>
	<div id="main">
		<h3>You have generated a word <c:out value="${counter}"/> times</h3>
		<div id="random-word">
			<c:out value="${randomWord}"/>
		</div>
		
		<form action="" method="GET">
		    <input type="submit" value="Generate">
		</form>		
		
		<p>The last time you generated a word was:</p>
		
		<div id="last-time">
			<c:out value="${time}"/>
		</div>
		
	</div>
</body>
</html>