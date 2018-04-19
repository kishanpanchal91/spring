package beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewEngineModel implements MethodReplacer{

	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("New Engine Model");
		return arg0;
	}

}
