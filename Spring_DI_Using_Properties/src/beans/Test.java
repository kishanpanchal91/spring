package beans;

import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private Properties driver;
	
	public void setDriver(Properties driver) {
		this.driver = driver;
	}

	void printPropertys(){
		Set keys=driver.keySet();
		for(Object key:keys)
		{
			System.out.println("key :"+key+"----Value :"+driver.get(key));
		}
		
	}
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("resource/spring.xml");
		Test t=(Test) ap.getBean("t");
		t.printPropertys();
		
		ApplicationContext app=new ClassPathXmlApplicationContext("resource/spring1.xml");
		Test t1=(Test) app.getBean("t");
		t1.printPropertys();
	}
	
}
