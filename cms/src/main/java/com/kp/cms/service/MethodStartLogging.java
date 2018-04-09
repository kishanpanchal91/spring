package com.kp.cms.service;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;

public class MethodStartLogging{

	static final Logger logger = Logger.getLogger("MyBeforeAdvice");

	@Before("execution(* com.kp.cms.service.RegistrationService.registerStudent(..))")
	public void before(JoinPoint j) {
		logger.info("start->"+j.getTarget());
	}
	

}
