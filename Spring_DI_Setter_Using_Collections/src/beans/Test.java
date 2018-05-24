package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	List cars;
	Set model;
	Map engine;

	public void setCars(List cars) {
		this.cars = cars;
	}
	public void setModel(Set model) {
		this.model = model;
	}

	public void setEngine(Map engine) {
		this.engine = engine;
	}

	public void listOfcars() {
		System.out.println("List of cars is");
		for (Object car : cars ) {
			System.out.println(":" + car);
		}
	}

	public void setofModel() {
		System.out.println("List of model is");
		for (Object m : model) {
			System.out.println(":" + m);
		}
	}

	public void ListofEngine() {
		System.out.println("List of engine is");
		for (Object key : engine.keySet()) {
			System.out.println("key :"+key+": value :" + engine.get(key));
		}
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
		Test test = (Test) context.getBean("t");
		test.listOfcars();
		test.setofModel();
		test.ListofEngine();
	}
}
