package beans;

public class ClassFactory {
	
	
	
static String name;
 String carname;

 public void setCarname(String carname) {
	this.carname = carname;
}
public static void setName(String name) {
	ClassFactory.name = name;
}

public static Car getCarInstance() throws Exception{
	return (Car)Class.forName(ClassFactory.name).newInstance();
}

public  Car getInstance() throws Exception{
	return (Car)Class.forName(carname).newInstance();
}

}
