package com.example.aop;

import java.util.logging.Logger;

public class BusinessClass {

	static final Logger logger = Logger.getLogger("BusinessClass");
	public void display() {
		
		logger.info("Display method called..");
	}
}
