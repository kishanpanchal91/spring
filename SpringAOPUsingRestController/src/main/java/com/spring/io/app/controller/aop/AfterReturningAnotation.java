package com.spring.io.app.controller.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterReturningAnotation {
	
	@AfterReturning(pointcut="execution (* com.spring.io.app.controller.StudentController.afterReturning(..))",returning="result")
	public void afterReturning(JoinPoint point,Object result) {
		System.out.println("After returning called :" + result);
		
	}

}
