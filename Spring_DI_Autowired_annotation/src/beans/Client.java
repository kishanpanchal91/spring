package beans;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	static AtomicInteger atomicInteger=new AtomicInteger();
	public static void main(String[] args) {
		//ApplicationContext ap = new ClassPathXmlApplicationContext("resources/autowired_byType.xml");
	 	//ApplicationContext ap = new ClassPathXmlApplicationContext("resources/autowired_byName.xml");
	 	//ApplicationContext ap = new ClassPathXmlApplicationContext("resources/autowired_Constructor.xml");
	 	ApplicationContext ap = new ClassPathXmlApplicationContext("resources/autowired.xml");
		Car c=(Car)ap.getBean("a");
	   c.printcarData();
		
	
	}
}
