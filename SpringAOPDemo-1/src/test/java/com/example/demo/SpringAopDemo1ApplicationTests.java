package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.logger.services.MyAfterReturningAdvice;
import com.example.logger.services.MyAroundAdvice;
import com.example.logger.services.MyMethodsBeforeAdvice;
import com.example.logger.services.MyThrowAdvice;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAopDemo1ApplicationTests {

	@Test
	public void contextLoads() {
		
		// XML config approach
		ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		BusinessClass b = (BusinessClass) ap.getBean("b");
		b.display();
		
		//Programmatic approach======================================================================
		/*ProxyFactoryBean proxy = new ProxyFactoryBean();
		BusinessClass b = new BusinessClass();
		MyMethodsBeforeAdvice myMethodsBeforeAdvice = new MyMethodsBeforeAdvice();
		MyAfterReturningAdvice myAfterReturningAdvice = new MyAfterReturningAdvice();
		MyAroundAdvice myAroundAdvice =new MyAroundAdvice();
		MyThrowAdvice throwAdvice = new MyThrowAdvice();
		
		proxy.addAdvice(myMethodsBeforeAdvice);
		proxy.addAdvice(myAfterReturningAdvice);
		proxy.addAdvice(myAroundAdvice);
		proxy.addAdvice(throwAdvice);

		proxy.setTarget(b);
		BusinessClass businessClassProxy = (BusinessClass) proxy.getObject();
		try {
			businessClassProxy.display();
		} catch (Exception e) {
		}*/
	}

}
