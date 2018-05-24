package com.spring.io.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.io.app.controller.buisness.Student;
import com.spring.io.app.controller.buisness.StudentOperation;

@RestController
public class StudentController {
	
	@Autowired
	StudentOperation studentoperation;
			
			
@RequestMapping(value="/getStudents")
public List<Student> getStudentDetails() {
	System.out.println("Enter in getStudentDetails :::::::::::::::::::::");
	return studentoperation.getAllStudent("Admin");
}

@RequestMapping(value="/hello")
public String HelloWorld() {
	return "Hi";
}
@RequestMapping(value="/after")
public String after() {
	System.out.println("called controller");
	return "This is after advise";
}
@RequestMapping(value="/afterR")
public String afterReturning() {
	System.out.println("called controller");
	return "This is afterReturning advise";
}


@RequestMapping(value="/errors")
public void error() {
	try {
		studentoperation.error("smit");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
