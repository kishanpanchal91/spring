package com.boot.vo;

public class StudentRequest {

	private String firstName;
	private String lastName;
	private String age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentRequest [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
}
