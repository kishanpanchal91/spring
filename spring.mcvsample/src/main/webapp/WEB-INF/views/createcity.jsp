<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<spring:url value="/js/app.js" var="mainJs"></spring:url>
<script src="${mainJs}"></script>
<title>Create City</title>
</head>
<body>
	<c:choose>
		<c:when test="${city.id ne null}">
			<c:set value="${city.id}" var="action"></c:set>
		</c:when>
		<c:otherwise>
			<c:set value="add" var="action"></c:set>
		</c:otherwise>
		</c:choose>
	<h1>Create City Form Example</h1>
	<hr>

	<div class="form">

		<form action="${action}" method="post" id="cityForm">
		<table>
			<tr>
				<td>City Name:</td>
				<td><input id="city" name="name" value="${city.name}" /></td>
			</tr>
			<tr>
				<td>State:</td>
				<td><input id="state" name="state" value="${city.state}" /></td>
			</tr>
			<tr>
				<td colspan="2"><c:choose>
						<c:when test="${city.id ne null}">
							<input type=button value="Update City" onclick="validate(); editcity('${city.id}')" />
						</c:when>
						<c:otherwise>
							<input type="submit" value="Add City" onclick="validate()" />
						</c:otherwise>
					</c:choose></td>

			</tr>
		</table>
		</form>
	</div>

	<br>
	<h3>
		<a href="/"><b>Go to Home</b></a>
	</h3>
</body>
</html>