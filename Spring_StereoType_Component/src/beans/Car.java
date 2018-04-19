package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Qualifier("b")
	@Autowired
	private Engine engine;
	
	void printcarData(){
		System.out.println("::::"+engine.getModel());
	}
}
