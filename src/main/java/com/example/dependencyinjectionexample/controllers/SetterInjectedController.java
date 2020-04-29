package com.example.dependencyinjectionexample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.dependencyinjectionexample.services.GreetingService;

@Controller
public class SetterInjectedController {
	
	private GreetingService greetingService;
	
	@Qualifier("setterGreetingService")
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreetingService() {
		return greetingService.sayGreeting();
	}

}
