package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	private String carName;
	@Qualifier("b")
	@Autowired
	private Engine engine;
	
public void setCarName(String carName) {
	this.carName = carName;
}
	
	void printcarData(){
		System.out.println("car company name is"+carName);
		System.out.println("::::"+engine.getModel());
	}
}
