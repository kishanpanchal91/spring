package client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Student;


public class Test {
	public static void main(String[] args) {  
		
		//J2EE container
		// Create objects while loading itself if scope singleton
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
	    Student student1=(Student)ap.getBean("studentbean");  
	    System.out.println(student1.toString());
	}  
	
}
