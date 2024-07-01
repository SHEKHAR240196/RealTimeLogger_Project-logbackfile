package com.logger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	private static Logger logger=LoggerFactory.getLogger(WelcomeController.class);
	
	@GetMapping("/welcomedata")
	public String getAllLocation() {
		
		String msg="StaringPoint of method getAllLocation {} ";
		
		logger.info("Entering to the method " + msg);
		
		System.out.println("This is the logging level info");
		
		String msgs="EndingPoint";
		
		logger.info("End to the method " + msgs);
		
		return "welcome to bikkadIt";
		
	}

}
