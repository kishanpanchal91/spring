package com.spring.io.app.controller.buisness;

import java.io.Serializable;

public class Student implements Serializable{

	private String name;
	private String age;
	private String number;
	
	
	public Student(String name, String age, String number) {
		super();
		this.name = name;
		this.age = age;
		this.number = number;
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
}
