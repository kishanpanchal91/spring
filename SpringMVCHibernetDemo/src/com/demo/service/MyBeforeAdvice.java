package com.demo.service;

import java.util.logging.Logger;

public class MyBeforeAdvice{

	static final Logger logger = Logger.getLogger("MyBeforeAdvice");

	public void before() {
		logger.info("Before advice called..");
	}
	

}
