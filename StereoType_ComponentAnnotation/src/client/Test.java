package client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Address;
import beans.Student;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Student s = (Student) ap.getBean(Student.class);
		System.out.println(s.toString());
	}
}
