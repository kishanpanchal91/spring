<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<spring:url value="/js/app.js" var="mainJs"></spring:url>
<script src="${mainJs}"></script>
<title>Total Cities</title>
</head>
<body>
	<h1>Total Cities</h1>
	<hr>

	<table align="left" border="2">
		<tr>
		<td>City Name</td>
		<td>State</td>
		<td>Edit</td>
		<td>Delete</td>
		</tr>
		<c:forEach items="${cities}" var="element">
			<tr>
				<td>${element.name}</td>
				<td>${element.state}</td>
				<td><a href="/city/${element.id}" class="btn-edit">Edit</a></td>
				<td><a href="#" class="btn-delete" onclick="deletecity('${element.id}')">Delete</a></td>
			</tr>
			
		</c:forEach>
	</table>
	
	<br />
	<br />
	<h3><a href="/"><b>Go to Home</b></a></h3>
</body>
</html>