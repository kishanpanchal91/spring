package beans;

import org.springframework.beans.factory.FactoryBean;

public class ClassFactory implements FactoryBean{
	
String carname;

 public void setCarname(String carname) {
	this.carname = carname;
}


@Override
public Object getObject() throws Exception {
	// TODO Auto-generated method stub
	return (Car)Class.forName(carname).newInstance();
}


@Override
public Class getObjectType() {
	// TODO Auto-generated method stub
	return Car.class;
}


@Override
public boolean isSingleton() {
	// TODO Auto-generated method stub
	return true;
}

}
