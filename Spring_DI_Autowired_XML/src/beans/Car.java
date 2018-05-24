package beans;

public class Car {

	private String carName;
	private Engine engine;
	
	
	public Car( Engine engine) {
		
		this.engine = engine;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	void printcarData(){
		System.out.println("car company name is"+carName);
		System.out.println("::::"+engine.getModel());
	}
}
