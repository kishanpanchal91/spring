package client;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Student;


public class Test {
	public static void main(String[] args) {  
		//core container
	    Resource resource=new ClassPathResource("resources/applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	     
	    // IOC container i.e. BeanFactory core container will create object only when getBean method calls.
	    Student student1=(Student)factory.getBean("studentbean1");  
	    Student student2=(Student)factory.getBean("studentbean1");  
	    System.out.println(student1==student2); // if singleton scope
	    student1.displayInfo(); 
	    
	    Student student3=(Student)factory.getBean("studentbean2");  
	    Student student4=(Student)factory.getBean("studentbean2");  
	    System.out.println(student3==student4); // if prototype scope

	}  
	
}
