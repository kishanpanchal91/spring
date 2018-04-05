package factory;

import org.springframework.beans.factory.FactoryBean;

import beans.IStudent;

public class StudentFactory implements FactoryBean {
	
	private String className;
	
	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public Object getObject() throws Exception {
		return (IStudent) Class.forName(className).newInstance();
	}

	@Override
	public Class getObjectType() {
		return IStudent.class;
	}
		
}
