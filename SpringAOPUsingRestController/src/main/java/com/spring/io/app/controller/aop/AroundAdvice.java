package com.spring.io.app.controller.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAdvice {
//	@Around("execution(* com.spring.io.app.controller.buisness.StudentOperation.getAllStudent(..))")
	public void aroundAdvice(ProceedingJoinPoint  joinpoint) throws Throwable {
		System.out.println("aroundAdvice() is running!");
		System.out.println("class name " + joinpoint.getSignature());
		//joinpoint.getArgs()[0] = "Admin";
		
	//	joinpoint.proceed(joinpoint.getArgs());
		
		joinpoint.proceed();
		System.out.println("signature " + joinpoint.getArgs()[0]);
		
	}
}
