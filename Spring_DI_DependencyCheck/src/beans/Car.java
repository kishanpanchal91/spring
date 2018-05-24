package beans;

public class Car {

	private String carName;
	private Engine engine;
	 
	public Car() {
		// TODO Auto-generated constructor stub
	System.out.println("car constructor ..................");
	}
	
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printCarData(){
		System.out.println("car Name is " +carName +"and year is " +engine.getModelYear());
	}
}
