package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	String name;

	public void setName(String name) {
		this.name = name;
	}

	private void helloworld(String value) {
		System.out.println("Hi......"+value+"......" + name);

	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		Test test = (Test) applicationContext.getBean("t");
		test.helloworld("welcome");
	}
}
