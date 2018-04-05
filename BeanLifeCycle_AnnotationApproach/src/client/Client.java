package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Student;

public class Client {

	public static void main(String[] args) {

		// Need to use ConfigurableApplicationContext only for bean life cycle as it has close() method for destroy
		// otherwise init will call and there is no way to destroy
		// while context loading itself it will call afterPropertiesSet method..i.e. before getBean
		
		//ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		System.out.println("Before get bean method..");
		Student st = (Student) ap.getBean("student");
		st.printData();
		ap.close(); // here destroy will call i.e. while context closing
	}
}
