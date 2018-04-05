package factory;

import beans.IStudent;

public class StudentFactory {
	
	private String className;
	
	public void setClassName(String className) {
		this.className = className;
	}

	public IStudent getInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
			return (IStudent) Class.forName(className).newInstance();
	}
		
}
