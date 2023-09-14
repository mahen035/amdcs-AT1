package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	//@Autowired
	//private Car myCar;
	
	Person(int age){
		this.age = age;
	}

	
	
	

}
