package com.example.logger.services;

import java.util.logging.Logger;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvice implements MethodInterceptor {

	static final Logger logger = Logger.getLogger("MyAroundAdvice");

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		
		logger.info("Before called...");
		arg0.proceed();
		logger.info("After called...");
		return null;
	}

}
