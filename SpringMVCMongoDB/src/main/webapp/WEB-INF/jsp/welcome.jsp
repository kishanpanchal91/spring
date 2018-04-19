<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Welcome to CRUD operations using Spring Boot MVC, AOP and
		MongoDB</h1>
	<form action="/createForm">
		<input type="submit" value="Create User" />
	</form>
	<br />
	<br />
	<c:if test="${createForm=='true'}">
		<h2>Create User</h2>
		<form action="/createUser" method="post" name="createForm">
			First Name : <input type="text" name="firstName" /> Last Name : <input
				type="text" name="lastName" /> <input type="submit" value="Submit" />
		</form>
	</c:if>
	<c:if test="${users != null}">
		<table border="2">
			<tr>
				<td><b>First Name</b></td>
				<td><b>Last Name</b></td>
				<td></td>
				<td></td>
			</tr>
			<c:forEach items="${users}" var="user">
				<tr>
					<td>${user.firstName}</td>
					<td>${user.lastName}</td>
					<td><form action="/editForm/${user.id}" method="post">
							<input type="submit" value="Edit" />
						</form></td>
					<td><form action="/deleteUser/${user.id}">
							<input type="submit" value="Delete" />
						</form></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<c:if test="${editForm eq true}">
		<h2>Edit User</h2>
		<form:form action="/editUser/${user.id}" method="post"
			modelAttribute="user">
	First Name : <form:input path="firstName" />
	Last Name : <form:input path="lastName" />
			<input type="submit" value="Submit" />
		</form:form>
	</c:if>
</body>
</html>