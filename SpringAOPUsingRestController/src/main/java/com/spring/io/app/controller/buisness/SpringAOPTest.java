package com.spring.io.app.controller.buisness;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAOPTest {


	@Autowired
	private StudentOperation business1;


	@Test
	public void invokeAOPStuff() {
		System.out.println(":AOP TEST"+business1.getAllStudent("Smit").iterator().next());
	}
}