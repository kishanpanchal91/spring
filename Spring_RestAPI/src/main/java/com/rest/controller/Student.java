package com.rest.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.zip.InflaterInputStream;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Student implements Serializable {

	private static List<Student> studentlist = new ArrayList<Student>(Arrays.asList(new Student("Smit", "25", "smit@123.com"),
			new Student("Smit1", "25", "smit@123.com")
		/*	new Student("Smi2", "25", "smit@123.com"),
			new Student("Sm1", "25", "smit@123.com"),
			new Student("St1", "25", "smit@123.com"),
			new Student("mit1", "25", "smit@123.com"),
			new Student("mit3", "25", "smit@123.com")*/

	));

	private String name;
	private String age;
	private String email;

	public Student() {

	}

	public Student(String name, String age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", email=" + email + "]";
	}

/*	public static void main(String[] args) {
		Student students=new Student("a","12", "email");
		//studentlist.add(students);
		
		IntStream.range(0,studentlist.size()).mapToObj(mapper)
		
		//mapToObj(i -> studentlist.get(i).getName().equals("Smit") ? "" : null);
		 
		studentlist.forEach((s) -> {
			int idx = 0;
			if (s.getName().equals("Smit")) {

				studentlist.set(idx, students);
			}
			idx++;

		});
		System.out.println(studentlist);
	}*/

}
