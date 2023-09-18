package com.training.courseservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {
	
	
	private long studId;
	private String studName;
	private int age;
	private String grade;
	
	public Student(String studName, int age, String grade){
		this.studName = studName;
		this.age = age;
		this.grade = grade;
	}

}
