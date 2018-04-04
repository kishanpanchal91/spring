package beans;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Component;


@Component
public class Car {


	@Inject
	private Engine engine;
	
	
	void printcarData(){
		System.out.println("::::"+engine.getModel());
	}
}
