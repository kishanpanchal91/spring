package com.example.logger.services;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterReturningAdvice implements AfterReturningAdvice {

	static final Logger logger = Logger.getLogger("MyAfterReturningAdvice");

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		logger.info("After returning Advice called...");
		throw new Exception("Exception happened");

	}

}
