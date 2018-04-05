package beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student1 {

	public void myDestroy() {
		System.out.println("Student1 : Destroy method called...");
	}

	public void printData() {
		System.out.println("Student1 : Service method : printData");
	}
	public void myInit() {
		System.out.println("Student1 : Init method called");
	}

}
