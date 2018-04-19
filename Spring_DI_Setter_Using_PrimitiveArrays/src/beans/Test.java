package beans;

import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	String cars[];
	
	public void setCars(String[] cars) {
		this.cars = cars;
	}
	
	public void listOfcars() {
		System.out.println("List of cars is");
		for (String car : cars) {
			System.out.println(":" + car);
		}
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
		Test test = (Test) context.getBean("t");
		test.listOfcars();
	}
}
