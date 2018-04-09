<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="registration">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular.min.js"/>
<script src="/resources/js/registration.js"/>
</head>
<body>
	<div ng-controller="registrationController">
		<!-- <form action="Registration.demo" name="RegistrationForm" method="post">
			FirstName : <input type="text" ng-model="firstName"/><br/>
    		LastName : <input type="text" ng-model="lastName"/><br/>
			<input type="submit" value="Register"/>
		</form> -->
		Greeting : ${message}
	</div>
</body>
</html>