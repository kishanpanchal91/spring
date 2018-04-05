package com.example.aop;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	
	static final Logger logger = Logger.getLogger("ApplicationTests");

	@Autowired
	User user;
	
	@Test
	public void contextLoads() {

		ProxyFactoryBean proxy = new ProxyFactoryBean();
		BusinessClass b = new BusinessClass();
		MyBeforeAdvice advice = new MyBeforeAdvice();
		proxy.addAdvice(advice);
		proxy.setTarget(b);

		BusinessClass businessClassProxy = (BusinessClass) proxy.getObject();
		businessClassProxy.display();
	}

	@Test
	public void XML_AOP_Test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Customer customer = (Customer) context.getBean("customer");

		customer.addCustomer();
	}

	@Test
	public void Annotation_AOP_Test() {
		logger.info(user.getUserId());
	}

}
