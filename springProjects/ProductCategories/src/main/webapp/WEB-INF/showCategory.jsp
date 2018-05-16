<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Category Page</title>
</head>
<body>
	<h1><c:out value="${category.name}"/></h1>
	
	<div id="prducts">
		<h3>Products:</h3>
	 	<c:forEach var="product" items="${category.products}">
	 	<ul>
			<li><c:out value="${product.name}"/></li>
	 	</ul>
		</c:forEach>
	</div>
	
	<div id="add-products">
		<form:form method="POST" action="/categories/${category.id}/add_product" modelAttribute="category">
		<p>
			<form:label path="products">Add Product:
			<form:select path="products">
				<c:forEach var="products" items="${products}">
				<c:if test="${!category.getProducts().contains(products)}">
						<option value="${products.id}">${products.name}</option>
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