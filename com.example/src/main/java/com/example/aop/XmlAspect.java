package com.example.aop;

import java.util.logging.Logger;

public class XmlAspect {
	
	static final Logger logger = Logger.getLogger("XmlAdvice");
	
	public void beforeAdvice() {
		logger.info("beforeAdvice called....");
	}

}
