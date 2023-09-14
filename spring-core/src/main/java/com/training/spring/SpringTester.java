package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.spring.config.ApplicationConfig;

public class SpringTester {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		//Person p1 = (Person)context.getBean("person");
		Person p1 = context.getBean(Person.class);
		
		System.out.println(p1.getFirstName());
				
		//System.out.println(p1.getFirstName()+":"+p1.getAge()+" CarDetail:: "+p1.getMyCar().getCarDetail());
		
		//Car c1 = (Car)context.getBean("car");
		
		//System.out.println(c1.getMake());
		

	}

}
