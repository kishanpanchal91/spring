package com.kp.cms.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kp.cms.service.RegistrationService;

@Controller
public class RegistrationController{

	@Autowired
	RegistrationService registrationService;
	
	@RequestMapping("/")
	public String registration(Map<String, Object> model){
		registrationService.registerStudent(null);
		model.put("message", "Ok");
		return "registration2";	
	}
}
