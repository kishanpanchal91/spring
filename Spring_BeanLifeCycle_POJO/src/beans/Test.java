package beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test implements InitializingBean,DisposableBean{
	
	
	public Test() {
		System.out.println("Constructor called");
	}
public static void main(String[] args) {
	ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"resources/spring.xml"});
          Test t=(Test) applicationContext.getBean("ft");
          applicationContext.close();
}

@Override
public void afterPropertiesSet() throws Exception {


	System.out.println("Init called");
	
}

@Override
public void destroy() throws Exception{
	System.out.println("Destroys called");
}
}
