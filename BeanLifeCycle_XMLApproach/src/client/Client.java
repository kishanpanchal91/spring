package client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Student1;
import beans.Student2;

public class Client {

	public static void main(String[] args) {

		// Need to use ConfigurableApplicationContext only for bean life cycle 
		//as it has life cycle methods like close() method for destroy, 
		//refresh() method for refreshing context etc
		// otherwise init will call and there is no way to destroy
		// while context loading itself it will call afterPropertiesSet method..i.e. before getBean
		
		//ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		System.out.println("Before get bean method..");
		Student1 st1 = (Student1) ap.getBean("student1");
		st1.printData();
		ap.close(); // here destroy will call i.e. while context closing
		ap.refresh(); // on refresh again init will call
		Student2 st2 = (Student2) ap.getBean("student2");
		st2.printData();
	}
}
