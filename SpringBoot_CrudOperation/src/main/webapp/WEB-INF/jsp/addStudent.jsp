<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
	
<html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Application</title>
</head>
<body>
<Pre>
<form:form action="/save" method="post"   modelAttribute="student">
FirstName: <form:input type="text" path="firstName"/></br>
LastName : <form:input type="text" path="lastName"/></br>
Age      : <form:input type="text" path="age"/></br>
           <input type="submit" value="submit">
 <form:input type="hidden" path="id"/></br>
</form:form>
</Pre>
</body>
</html>