package com.example.aop;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service("user")
public class User {
	static final Logger logger = Logger.getLogger("User");

	public String getUserId() {
		logger.info("get User method called....");
		return "UserX";
	}
}
