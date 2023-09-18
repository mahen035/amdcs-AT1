package com.training.courseservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.courseservice.intercomm.StudentClient;
import com.training.courseservice.model.Course;
import com.training.courseservice.model.Student;
import com.training.courseservice.repository.CourseRepository;

@RestController
@RequestMapping("/courseapi")
public class CourseController {
	
	@Autowired
	CourseRepository repository;
	
	@Autowired
	StudentClient studClient;
	
	@GetMapping("/course")
	public ResponseEntity<List<Course>> getCourses(){
		List<Course> courseList = repository.findAll();
		return new ResponseEntity<>(courseList, HttpStatus.OK);
	}
	
	@PostMapping("/post")
	public ResponseEntity addCourse(@RequestBody Course course) {
		return new ResponseEntity(repository.save(course), HttpStatus.CREATED);
	}
	
	@GetMapping("/service/stud/{studId}")
	public Student getStud(@PathVariable int studId) {
		return studClient.getStudent(studId);
	}

}

//ReponseEntity: is a class which returns the http status code along with data
