package com.example.dependencyinjectionexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dependencyinjectionexample.controllers.MyController;

@SpringBootApplication
public class DependencyInjectionExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionExampleApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.HelloWorld();
		System.out.println(greeting);
	}

}
