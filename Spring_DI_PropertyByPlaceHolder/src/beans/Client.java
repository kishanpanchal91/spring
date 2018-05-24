package beans;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	static AtomicInteger atomicInteger=new AtomicInteger();
	public static void main(String[] args) {
	 	ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Car c=(Car)ap.getBean(Car.class);
	   c.printcarData();
		
	
	}
}
