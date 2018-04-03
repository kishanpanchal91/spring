package client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Student;


public class Test {
	public static void main(String[] args) {  
		
		//J2EE container
		// Create objects while loading itself if scope singleton
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/applicationContext.xml");

		// if singleton scope
		System.out.println("Student Bean 1 object already created before calling getbean as singleton");
	    Student student1=(Student)ap.getBean("studentbean1");  
	    Student student2=(Student)ap.getBean("studentbean1");  
	    System.out.println(student1==student2); 
	    
	    // if prototype scope
	    Student student3=(Student)ap.getBean("studentbean2");  
	    Student student4=(Student)ap.getBean("studentbean2");  
	    System.out.println(student3==student4); 
	    
	    student1.displayInfo();
	    
	}  
	
}
