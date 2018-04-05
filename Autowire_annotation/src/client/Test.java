package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Student;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Student s = (Student) ap.getBean("studentbean2");
		System.out.println(s.toString());
	}
}
