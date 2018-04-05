package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.StudentRegistrationBL;
import com.demo.vo.StudentRequestVO;

@Controller
public class StudentController{

	@Autowired
	StudentRegistrationBL studentRegistrationBL;
	
	@RequestMapping("/Student")
	public ModelAndView handleRequest(@ModelAttribute("form1") StudentRequestVO studentRequestVO) throws Exception {
		Map<String,String> map = new HashMap<String,String>();
		studentRegistrationBL.registerStudent();
		//map.put("name", studentRequestVO.getFirstName()+" "+studentRequestVO.getLastName());
		ModelAndView mv = new ModelAndView ("Welcome", "welcome",studentRequestVO);
		return mv;	
	}
}
