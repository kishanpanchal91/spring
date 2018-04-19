package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		//ApplicationContext ap = new ClassPathXmlApplicationContext("resources/autowired_byType.xml");
	 	//ApplicationContext ap = new ClassPathXmlApplicationContext("resources/autowired_byName.xml");
	 	//ApplicationContext ap = new ClassPathXmlApplicationContext("resources/autowired_Constructor.xml");
	 	ApplicationContext ap = new ClassPathXmlApplicationContext("resources/autowired_autoDetect.xml");
		Car c=(Car)ap.getBean("a");
	   c.printcarData();
	}
}
