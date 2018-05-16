<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Product Page</title>
</head>
<body>
	<h1><c:out value="${product.name}"/></h1>
	
	<div id="categories">
		<h3>Categories:</h3>
	 	<c:forEach var="category" items="${product.categories}">
	 	<ul>
			<li><c:out value="${category.name}"/></li>
	 	</ul>
		</c:forEach>
	</div>
	
	<div id="add-categories">
		<form:form method="POST" action="/products/${product.id}/add_category" modelAttribute="product">
		<p>
			<form:label path="categories">Add category:
			<form:select path="categories">
				<c:forEach var="categories" items="${categories}">
				<c:if test="${!product.getCategories().contains(categories)}">
						<option value="${categories.id}">${categories.name}</option>
				</c:if>
				</c:forEach>
			</form:select>
			</form:label>
		</p>
		
		<input type="submit" value="Add"/>
		
		</form:form>		
	</div>
	
</body>
</html>