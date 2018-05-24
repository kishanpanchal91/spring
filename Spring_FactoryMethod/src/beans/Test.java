package beans;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public Test() {
		System.out.println("Constructor called");
	}
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/spring.xml");
          Car t1=(Car) applicationContext.getBean("d");
          Car t=(Car) applicationContext.getBean("cf");
          System.out.println(t.getClass());
          System.out.println(t1.getClass());
}
}
