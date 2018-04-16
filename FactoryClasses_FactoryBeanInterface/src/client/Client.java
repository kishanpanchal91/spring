package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.IStudent;
import beans.Student1;
import beans.Student2;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		IStudent s1 = (IStudent)ap.getBean("sf");
		IStudent s2 = (IStudent)ap.getBean("sf");
		System.out.println(s1 instanceof Student2);
		System.out.println(s2 instanceof Student2);
		System.out.println(s1==s2);

	}
}