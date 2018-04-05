package com.example.aop;

import java.util.logging.Logger;

public class Customer {

	static final Logger logger = Logger.getLogger("Customer");
	public void addCustomer() {
		
		logger.info("addCustomer called..");
	}
}
