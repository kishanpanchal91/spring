package beans;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MBA {

	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
	
		System.out.println("In method Before Advice");
		
	}

}
