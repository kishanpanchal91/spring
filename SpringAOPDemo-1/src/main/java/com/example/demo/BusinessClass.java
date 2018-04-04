package com.example.demo;

import java.util.logging.Logger;

public class BusinessClass {

	static final Logger logger = Logger.getLogger("BusinessClass");
	
	public void display() {
		
		logger.info("Display method called..");
//		throw new Exception("Exception happened");
	}
}
