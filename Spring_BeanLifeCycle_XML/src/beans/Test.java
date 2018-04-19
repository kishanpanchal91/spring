package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public void init()
	{
		System.out.println("Init method called");
	}
	
	public void destroy()
	{
		System.out.println("destroy method called");
	}
	public Test() {
		System.out.println("Constructor called");
	}
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"resources/spring.xml","resources/spring_default.xml"});
          Test t=(Test) applicationContext.getBean("ft");
          Test t1=(Test) applicationContext.getBean("t");
          System.out.println(t.getClass());
}
}
