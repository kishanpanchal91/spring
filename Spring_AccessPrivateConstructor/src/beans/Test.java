package beans;

import java.lang.reflect.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private Test() {
		// TODO Auto-generated constructor stub
		System.out.println("Private Construction instantiated");
	}
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/spring.xml");
	applicationContext.getBean("t");
	/*//internally use reflection for instanciate the object of private constructor
	 Class t=(Class<Test>) java.lang.Class.forName("beans.Test");
	Constructor constructor[]=t.getDeclaredConstructors();
	constructor[0].setAccessible(true);
	t.newInstance();*/
}
}
