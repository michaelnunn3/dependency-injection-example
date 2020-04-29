package com.example.dependencyinjectionexample.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String HelloWorld() {
		System.out.println("Hello World");
		return "Hi Folks";
	}
}
