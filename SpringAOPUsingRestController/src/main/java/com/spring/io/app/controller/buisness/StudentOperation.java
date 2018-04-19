package com.spring.io.app.controller.buisness;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentOperation {
	List<Student> student = Arrays.asList(

			new Student("Smit", "20", "1234"), new Student("patadiya", "20", "1234")

	);

	public List<Student> getAllStudent(String a) {
		System.out.println("Enter in getStudentDetails buisness:::::::::::::::::::::"+ a);
		return student;
	}
	
	public void error(String a) throws Exception {
		System.out.println("Enter in error buisness:::::::::::::::::::::"+ a);
		throw new Exception("This is customException");
	}
}
