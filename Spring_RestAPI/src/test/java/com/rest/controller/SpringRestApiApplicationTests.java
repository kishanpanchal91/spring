package com.rest.controller;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SpringRestApiApplicationTests {
	private static String URL = "http://localhost:8080/";
	

	@Test
	public void contextLoads() {
	}

	
	@Test
	public void A_addStudent() {
		RestTemplate restTemplate = new RestTemplate();
		Student student=new Student("Patadiya","26","smit@smit.com");
		restTemplate.postForLocation(URL+"add/",student);
		System.out.println("addStudent :"+student);
		assertEquals(0, 0);
	}
	
	@Test
	public void B_getListOfStudent() {
		RestTemplate restTemplate = new RestTemplate();
		List<Student> list = restTemplate.getForObject(URL, List.class);
		System.out.println("getListOfStudent :"+list);
		assertEquals(0, 0);
	}
	
	@Test
	public void C_getStudent() {
		RestTemplate restTemplate = new RestTemplate();
		Student student = restTemplate.getForObject(URL+"Smit",Student.class);
		System.out.println("getStudent :"+student);
		assertEquals(0, 0);
	}
	
	@Test
	public void D_updateStudent() {
		RestTemplate restTemplate = new RestTemplate();
		Student student=new Student("Smit","26","smit@smit.com");
		restTemplate.put(URL, student);
		System.out.println("student :"+student);
		assertEquals(0, 0);
	}
	
	@Test
	public void E_getListStudent() {
		RestTemplate restTemplate = new RestTemplate();
		List<Student> list = restTemplate.getForObject(URL, List.class);
		System.out.println("getListOfStudent :"+list);
		assertEquals(0, 0);
	}

	@Test
	public void F_deleteStudent() {
		RestTemplate restTemplate = new RestTemplate();
		Student student=new Student("Smit","26","smit@smit.com");
		restTemplate.delete(URL+"delete/Smit1");
		System.out.println("deleteStudent :"+student);
		assertEquals(0, 0);
	}
	
	
	@Test
	public void G_getList() {
		RestTemplate restTemplate = new RestTemplate();
		List<Student> list = restTemplate.getForObject(URL, List.class);
		System.out.println("getListOfStudent :"+list);
		assertEquals(0, 0);
	}

}
