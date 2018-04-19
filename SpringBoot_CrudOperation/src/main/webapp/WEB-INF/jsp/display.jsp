<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Application</title>
</head>
<body>

	<c:if test="true">
		<h3>
			<a href="<c:url value='/add' />">Add Student</a>
		</h3>

		<h3>Student List</h3>
		<table class="tg" border="2px">
			<tr>
				<th width="50">FirstName</th>
				<th width="50">LastName</th>
				<th width="50">Age</th>
				<th width="60">Edit</th>
				<th width="60">Delete</th>
			</tr>
			<c:forEach items="${students}" var="student">
				<tr>
					<td>${student.firstName}</td>
					<td>${student.lastName}</td>
					<td>${student.age}</td>
					<td><a href="<c:url value='/get/${student.id}' />">Edit</a></td>
					<td><a href="<c:url value='/delete/${student.id}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>


	</c:if>

</body>
</html>