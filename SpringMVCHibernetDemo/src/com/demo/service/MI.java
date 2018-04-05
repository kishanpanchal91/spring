/*package com.demo.service;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MI implements MethodInterceptor {

	static final Logger logger = Logger.getLogger("MI");
	
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		logger.info("before proceed");
		arg3.invoke(arg1, arg2);
		logger.info("after proceed");
		return arg0;
	}

}
*/