package beans;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	static String name;
	public static void setName(String name) {
		Test.name = name;
	}
	public Test() {
		System.out.println("Constructor called");
	}
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/spring.xml");
          Test t=(Test) applicationContext.getBean("t");
          System.out.println(t.name);
         
}
}
