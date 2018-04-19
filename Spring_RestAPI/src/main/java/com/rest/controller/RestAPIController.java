package com.rest.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {
	
	private List<Student> studentlist = new ArrayList<>(Arrays.asList(new Student("Smit", "25", "smit@123.com"),
			new Student("Smit1", "25", "smit@123.com")

	));
	

	@RequestMapping("/")
	public List<Student> getlistOfStudent() {
		System.out.println("In getlistOfStudent");
		return studentlist;

	}

	@RequestMapping("/{id}")
	public Student getStudent(@PathVariable String id) {
		System.out.println("In getStudent");
		return studentlist.stream().filter(student -> student.getName().equals(id)).findFirst().orElse(null);
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addStudent(@RequestBody Student student) {
		System.out.println("In addStudent");
		studentlist.add(student);
		return "Added SuccessFully";
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public String updateStudent(@PathVariable String id, @RequestBody Student student) {
		System.out.println("In updateStudent"+student);
		 
		//studentlist.stream().filter(s -> s.getName().equals(id)).findFirst().map(studentlist.get(index)::set);
		
		// IntStream.range(0,studentlist.size()).filter(i -> studentlist.get(i).getName().equals(id)).collect(Collector., null, null);
		 
		// mapToObj(i->studentlist.set(i, student));
		 
		// forEach(i->studentlist.get(i).getName().equals(id) ? 0 : null);
		/*studentlist.forEach((s) -> 
			 int idx=1;
			if (s.getName().equals(id)) {
				
			studentlist.set(idx, student);
		}
			idx++;
			
		});*/
		/*for (int i = 0; i <= studentlist.size(); i++) {
			if (studentlist.get(i).getName().equals(id)) {
				studentlist.set(i, student);
			}
		}*/
		return "SuccessFully Updated";

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String removeStudent(@PathVariable String id) {
		System.out.println("In removeStudent" +id);
	//Student st=studentlist.stream().filter(student -> student.getName().equals(id)).findFirst().orElse(null);
		studentlist.removeIf((student) -> student.getName().equals(id));
		System.out.println(studentlist);
		return "Success";

	}
/*	public static void main(String[] args) {
		RestAPIController controller=new RestAPIController();
			//controller.studentlist.remove("Smit");
			controller.	
		System.out.println(controller.studentlist);
	}*/

}
