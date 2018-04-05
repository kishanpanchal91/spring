package beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {

	@PostConstruct
	public void myInit() throws Exception {
		System.out.println("Init method called");
	}
	public void printData() {
		System.out.println("Service method : printData");
	}
	@PreDestroy
	public void myDestroy() throws Exception {
		System.out.println("Destroy method called...");
	}

}
