package beans;

import java.util.Hashtable;
import java.util.TreeSet;
import java.util.Vector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WithOtherCollections {

	Vector cars;
	TreeSet model;
	Hashtable engine;

	public void setCars(Vector cars) {
		this.cars = cars;
	}

	public void setEngine(Hashtable engine) {
		this.engine = engine;
	}

	public void setModel(TreeSet model) {
		this.model = model;
	}

	public void listOfcars() {
		System.out.println("List of cars using vector");
		for (Object car : cars) {
			System.out.println(":" + car);
		}
	}

	public void setofModel() {
		System.out.println("List of model using Treeset ");
		for (Object m : model) {
			System.out.println(":" + m);
		}
	}

	public void ListofEngine() {
		System.out.println("List of engine using HashTable is");
		for (Object key : engine.keySet()) {
			System.out.println("key :" + key + ": value :" + engine.get(key));
		}
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring1.xml");
		WithOtherCollections test = (WithOtherCollections) context.getBean("t");
		test.listOfcars();
		test.setofModel();
		test.ListofEngine();
	}
}
