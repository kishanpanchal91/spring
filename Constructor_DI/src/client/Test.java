package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Student;

public class Test {
	public static void main(String[] args) {

		// J2EE container
		// Create objects while loading itself if scope singleton
		@SuppressWarnings("resource")
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		Student student1 = (Student) ap.getBean("studentbean");
		System.out.println(student1.toString());
		
		Student student2 = (Student) ap.getBean("studentbean2");
		System.out.println(student2.toString());
		
		Student student3 = (Student) ap.getBean("studentbean3");
		System.out.println(student3.toString());
		
		Student student4 = (Student) ap.getBean("studentbean4");
		System.out.println(student4.toString());
		
		Student student5 = (Student) ap.getBean("studentbean5");
		System.out.println(student5.toString());
	}

}
