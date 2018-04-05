package factory;

import beans.IStudent;

public class StudentFactory {
	
	private static String className;
	
	public static void setClassName(String className) {
		StudentFactory.className = className;
	}
	public static IStudent getInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
			return (IStudent) Class.forName(className).newInstance();
	}
		
}
