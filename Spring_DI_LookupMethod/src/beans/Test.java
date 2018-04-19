package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public Test() {
		System.out.println("Constructor called");
	}
public static void main(String[] args) {
	
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"resources/spring.xml"});
	
	      //Lookup method using Interface
          Car t=(Car) applicationContext.getBean("c");
          System.out.println(t.model().getEngineName());
          //Lookup method using Abstract Class
          CarClass t1=(CarClass) applicationContext.getBean("a");
          System.out.println(t1.model().getEngineName());
          //Lookup method using Concrete class which have imlementation
          ConcreteClass t2=(ConcreteClass) applicationContext.getBean("b");
          System.out.println(t2.model().getEngineName());
}
}
