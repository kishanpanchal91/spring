package beans;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
String name;
ContactDetails contactDetails[];

public void setContactDetails(ContactDetails[] contactDetails) {
	this.contactDetails = contactDetails;
}
public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Student [name=" + name + ", contactDetails=" + Arrays.toString(contactDetails) + "]";
}
public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("resources/spring.xml");
	Student student=(Student)context.getBean("t");
	System.out.println(student.toString());
}
}
