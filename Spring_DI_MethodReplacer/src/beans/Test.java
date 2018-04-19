package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public Test() {
		System.out.println("Constructor called");
	}
public static void main(String[] args) {
	
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"resources/spring.xml"});
	
	      //Lookup method using Interfac
          //Lookup method using Concrete class which have imlementation
          ConcreteClass t2=(ConcreteClass) applicationContext.getBean("b");
          System.out.println(t2.getClass());
          t2.model();
}
}
