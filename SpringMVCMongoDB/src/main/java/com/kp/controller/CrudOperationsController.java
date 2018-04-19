package com.kp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kp.data.User;
import com.kp.services.ICrudOperationsServices;

/**
 * @author kishan.panchal
 *
 */
@Controller
public class CrudOperationsController {
	
	private static final Logger log = LoggerFactory.getLogger(CrudOperationsController.class);

	@Autowired
	ICrudOperationsServices services;
	
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("users", services.getUsers());
		log.info(services.getUsers().toString());
		return "welcome";
	}
	
	@RequestMapping("/createForm")
	public String showCreateUserForm(Model model) {
		model.addAttribute("createForm", "true");
		return "welcome";
	}
	
	@PostMapping("/editForm/{id}")
	public String showEditUserForm(@PathVariable String id, Model model) {
		model.addAttribute("user", services.getUserById(id));
		model.addAttribute("editForm", "true");
		return "welcome";
	}
	
	@PostMapping("/createUser")
	public String createUser(@ModelAttribute("createForm") User user, Model model) {
		services.createUser(user);
		model.addAttribute("createForm", "false");
		model.addAttribute("users", services.getUsers());
		return "welcome";
	}
	
	@RequestMapping("/editUser/{id}")
	public String editUser(@ModelAttribute("user") User user, Model model) {
		log.info(user.toString());
		services.updateUser(user);
		model.addAttribute("editForm", "false");
		model.addAttribute("users", services.getUsers());
		return "welcome";
	}
	
	@RequestMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable String id, Model model) {
		services.deleteUser(id);
		model.addAttribute("users", services.getUsers());
		return "welcome";
	}
}
