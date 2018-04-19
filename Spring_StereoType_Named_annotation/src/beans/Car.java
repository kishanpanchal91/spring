package beans;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;


@Named
public class Car {


	@Inject
	private Engine engine;
	
	
	void printcarData(){
		System.out.println("::::"+engine.getModel());
	}
}
