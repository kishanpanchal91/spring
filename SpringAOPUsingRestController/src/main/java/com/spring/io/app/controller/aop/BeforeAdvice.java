package com.spring.io.app.controller.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Aspect
@Configuration
public class BeforeAdvice {

@Before("execution(* com.spring.io.app.controller.buisness.StudentOperation.HelloWorld(..))")
public void beforeAdvice(JoinPoint joinpoint) {
	System.out.println("beforeAdvice() is running!");
	System.out.println("class name " + joinpoint.getSignature());
	
	
	joinpoint.getArgs()[0] = "Admin";
	System.out.println("signature " + joinpoint.getArgs()[0]);
	
}

}
