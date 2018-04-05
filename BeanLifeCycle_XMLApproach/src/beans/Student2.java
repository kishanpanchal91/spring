package beans;

public class Student2 {

	public void destroy() {
		System.out.println("Student2 : Destroy method called...");
	}

	public void printData() {
		System.out.println("Student2 : Service method : printData");
	}
	public void init() {
		System.out.println("Student2 : Init method called");
	}

}
