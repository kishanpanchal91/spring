package beans;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public Test() {
		// TODO Auto-generated constructor stub
	System.out.println("Instansiated");
	}
public static void main(String[] args) {
	Resource resource =new ClassPathResource("resources/spring.xml");
	BeanFactory beanFactory=new XmlBeanFactory(resource);
	beanFactory.getBean("t");
	beanFactory.getBean("t");
	beanFactory.getBean("t");
	beanFactory.getBean("t");
}
}
