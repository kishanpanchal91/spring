package com.spring.io.app.controller.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAdvice {

@After("execution(* com.spring.io.app.controller.StudentController.after(..))")
public void afterAdvice(JoinPoint joinpoint) {
	System.out.println("This is after advise called");
}
}
