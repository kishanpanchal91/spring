package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.boot.entity.StudentEntity;
import com.boot.service.IStudentService;
import com.boot.vo.StudentRequest;

@Controller
public class StudentController {

	@Autowired
	IStudentService iStudentService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getStudent() {
		System.out.println(":::::::::::::calling getStudent");
		//model.addAttribute("student",null);
		List<StudentEntity> entity = iStudentService.getData();
		if (entity.size() > 0)
			return new ModelAndView("display", "students", entity);
		else
			return new ModelAndView("addStudent", "student", new StudentEntity());
		//return "addStudent";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addStudent() {
		System.out.println(":::::::::::::calling addStudent");
		return new ModelAndView("addStudent", "student", new StudentEntity());
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public ModelAndView getStudents(@PathVariable Long id) {
		System.out.println(":::::::::::::calling getStudent");
		return new ModelAndView("addStudent", "student", iStudentService.getstudent(id));
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute("student") StudentRequest request) {
		System.out.println(":::::::::::::calling saveStudent" + request);
		try {
			iStudentService.saveData(request);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return getStudent();
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteStudent(@PathVariable Long id) {
		System.out.println(":::::::::::::calling delete");
		iStudentService.delete(id);
		return getStudent();
	}

}
