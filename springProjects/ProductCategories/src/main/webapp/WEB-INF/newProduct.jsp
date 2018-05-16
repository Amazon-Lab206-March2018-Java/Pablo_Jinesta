<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>New Product</title>
</head>
<body>
	<h1>New Product</h1>
	<form:form method="POST" action="/products/new" modelAttribute="product">
		<p>
		    <form:label path="name">Name:
		    <form:errors path="name"/>
		    <form:input path="name"/></form:label>
		</p>
		<p>
		    <form:label path="description">Description:
		    <form:errors path="description"/>
		    <form:textarea path="description"/></form:label>
		</p>
		<p>
		    <form:label path="price">Price
		    <form:errors path="price"/>     
		    <form:input type="number" path="price" step=".01" /></form:label>
	    </p>
	    <input type="submit" value="Create"/>
	</form:form>
</body>
</html>