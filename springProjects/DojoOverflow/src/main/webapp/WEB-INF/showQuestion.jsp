<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Question Profile</title>
</head>
<body>
	<h1>${question}</h1>
	
	<div id="tages">
		<h3>Tags:</h3>
	</div>
	<div id="answers">
		<table border="1">
			<thead>
				<tr>
					<th>Answers</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td></td>
				</tr>
			</tbody>
		</table>
	</div>
	
	<div id="add-answers">
		<form:form method="POST" action="/questions/{id}/answer" modelAttribute="new_answer">
		    <form:label path="answer">Answer
		    <form:errors path="answer"/>
		    <form:textarea path="answer"/></form:label>    
		    <input type="submit" value="Answer it"/>
		</form:form>	
	</div>
</body>
</html>