package com.example.aop;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnotationAspect {
	static final Logger logger = Logger.getLogger("AnnotationAspect");

	@Before("execution(* com.example.aop.User.getUserId(..))")
	public void beforeAdvice() {
		logger.info("beforeAdvice method called...");

	}
}
