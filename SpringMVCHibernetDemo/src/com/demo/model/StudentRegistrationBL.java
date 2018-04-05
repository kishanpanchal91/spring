package com.demo.model;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service
public class StudentRegistrationBL {

	static final Logger logger = Logger.getLogger("StudentRegistrationBL");
	public void registerStudent() {
		logger.info("registerStudent called....");
	}
}
