package com.example.logger.services;

import java.util.logging.Logger;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowAdvice implements ThrowsAdvice {

	static final Logger logger = Logger.getLogger("MyAfterReturningAdvice");

	public void afterThrowing(Exception ex)
	{
		logger.info("Throwing advice called...");
		ex.printStackTrace();
	}
}
