package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Student;

public class Client {

	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		System.out.println(Student.schoolName);
		
	}

}
