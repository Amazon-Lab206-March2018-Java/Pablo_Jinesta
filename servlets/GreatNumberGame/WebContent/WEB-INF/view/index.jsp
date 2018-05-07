<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Great Number Game</title>
</head>
<body>
    <div id="main">
        <h1>Welcome to the Great Number Game!</h1>
        <p>I am thinking of a number between 1 and 100</p>
        <p>Take a guess!</p>

		<p><c:out value="${message}"/></p>
		
        <form action='' method='POST'>
            <input type="number" name="guess" min="1" max="100" required>
            <input type='submit' value='<c:out value="${action}"/>'>
        </form>
        
    </div>
</body>
</html>