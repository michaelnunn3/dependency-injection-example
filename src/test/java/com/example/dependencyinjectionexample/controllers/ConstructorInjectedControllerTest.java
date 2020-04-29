package com.example.dependencyinjectionexample.controllers;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import com.example.dependencyinjectionexample.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new ConstructorGreetingService());
	}

	@Test
	void testGetGreetingService() {
		System.out.println(controller.getGreetingService());
	}

}
