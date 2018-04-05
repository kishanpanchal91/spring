package com.spring.bootquick.quick;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickController {
	
	@RequestMapping("/quick")
	public String quickHello() {
		return "Hello!!";
	}

}
