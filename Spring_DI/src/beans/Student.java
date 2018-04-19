package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
	String name;
	Address address;

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void studentDetails() {
		System.out.println("Student name is " + name);
		System.out.println("Student Address is" + address);
	}

	public static void main(String[] args) {
		String [] files=new String[]{"resources/spring.xml","resources/spring1.xml"};
        ApplicationContext context=new ClassPathXmlApplicationContext(files);
       Student student=(Student) context.getBean("t");
       student.studentDetails();
	}
}
