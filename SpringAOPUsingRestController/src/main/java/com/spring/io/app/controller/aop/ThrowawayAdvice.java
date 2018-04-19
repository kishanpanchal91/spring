package com.spring.io.app.controller.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class ThrowawayAdvice {

@AfterThrowing(pointcut="execution(* com.spring.io.app.controller.buisness.StudentOperation.error(..))",throwing="error")
public void throwAwayAdvise(JoinPoint joinpoint,Throwable error) throws Throwable {
	System.out.println("This is throwing  exception throw ThrowableAdvise "+error);
}

}
