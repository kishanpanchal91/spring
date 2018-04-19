package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public Test() {
		System.out.println("Constructor called");
	}
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/spring.xml");
           applicationContext.getBean("t");
           applicationContext.getBean("t");
           applicationContext.getBean("t");
           applicationContext.getBean("t");
}
}
