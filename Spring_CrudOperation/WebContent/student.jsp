<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="Student.do" name="student" method="POST">  
FirstName :<input name="firstName" value="${student.firstName}"/>
LastName :<input  name="lastName" value="${student.lastName}"/>
Email:<input  name="email" value= "${student.email}"/>
<input type="submit" value="Submit"/>
</body>
</html>