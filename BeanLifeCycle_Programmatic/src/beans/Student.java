package beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean {

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method called...");
	}

	public void printData() {
		System.out.println("Service method : printData");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init method called");
	}

}
