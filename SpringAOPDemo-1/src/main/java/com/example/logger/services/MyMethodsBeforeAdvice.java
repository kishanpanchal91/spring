package com.example.logger.services;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodsBeforeAdvice implements MethodBeforeAdvice{

	static final Logger logger = Logger.getLogger("MyBeforeAdvice");

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {

		logger.info("Method Before Advice called...");
	}

}
