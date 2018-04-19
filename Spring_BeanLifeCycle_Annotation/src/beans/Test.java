package beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	@PostConstruct
	public void init()
	{
		System.out.println("Init method called");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy method called");
	}
	public Test() {
		System.out.println("Constructor called");
	}
public static void main(String[] args) {
	
	ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"resources/spring.xml"});
          Test t=(Test) applicationContext.getBean("ft");
}
}
