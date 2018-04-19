package com.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.client.RestTemplate;


public class RestClient {
	public static void main(String[] args) {
		 RestTemplate restTemplate=new RestTemplate();
	     List<Student> student=(List<Student>) restTemplate.getForObject("http://localhost:9999/getStudents", List.class);
	     System.out.println(student);
	}
	
}
