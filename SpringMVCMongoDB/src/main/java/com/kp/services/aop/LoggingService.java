package com.kp.services.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author kishan.panchal
 *
 */
@Aspect
@Component
public class LoggingService {

	
	private static final Logger log = LoggerFactory.getLogger(LoggingService.class);

	
	@Before("execution(* com.kp.services.impl.CrudOperationsServices.*(..))")
	public void log(JoinPoint j) {
		log.info("start-->"+j.getTarget());
	}
}
