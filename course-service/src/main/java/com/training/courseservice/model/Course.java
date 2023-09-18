package com.training.courseservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long courseId;
	
	private String courseName;
	private String courseDesc;
	private int duration;
	

}
