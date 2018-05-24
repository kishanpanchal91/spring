package com.boot.vo;

public class StudentRequest {

	private Long id;
	private String firstName;
	private String lastName;
	private String age;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
		return "StudentRequest [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ "]";
	}
	
	
}
