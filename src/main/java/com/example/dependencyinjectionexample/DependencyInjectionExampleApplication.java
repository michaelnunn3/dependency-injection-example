package com.example.dependencyinjectionexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dependencyinjectionexample.controllers.ConstructorInjectedController;
import com.example.dependencyinjectionexample.controllers.I18nController;
import com.example.dependencyinjectionexample.controllers.MyController;
import com.example.dependencyinjectionexample.controllers.PropertyInjectedController;
import com.example.dependencyinjectionexample.controllers.SetterInjectedController;

@SpringBootApplication
public class DependencyInjectionExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionExampleApplication.class, args);
		
		
		System.out.println("-------Profile");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		
		System.out.println("-------Primary");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.HelloWorld());
		
		System.out.println("-------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("-------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreetingService());
		
		System.out.println("-------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreetingService());
	}

}
