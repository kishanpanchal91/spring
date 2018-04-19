package beans;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;


@Component
public class Car {


	@Resource
	private Engine engine;
	
	
	void printcarData(){
		System.out.println("::::"+engine.getModel());
	}
}
