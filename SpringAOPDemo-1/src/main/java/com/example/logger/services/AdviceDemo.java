package com.example.logger.services;

import java.util.logging.Logger;

public class AdviceDemo {

	static final Logger logger = Logger.getLogger("AdviceDemo");

	public void before() throws Throwable {

		logger.info("Method Before Advice called...");
	}
}
