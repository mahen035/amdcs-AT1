package com.training.studentservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.studentservice.model.Student;
import com.training.studentservice.repository.StudentRepository;

@RestController   // combination of @Controller+@ResponseBody
@RequestMapping("/studapi")  // class level request mapping
public class StudentController {
	
	@Autowired
	StudentRepository repository;  //Repository is being autowired

	/**
	 * 
	 * @return List<Student>
	 * call findAll() method of repository to fetch all student records
	 */
	@GetMapping("/stud")
	public List<Student> getStud() {
		
		return repository.findAll();
	}
	
	/**
	 * 
	 * @param stud to be passed as request body
	 * call the save() method of repository to save stud data
	 */
	@PostMapping("/post")
	public void post(@RequestBody Student stud) {
		repository.save(stud);
	}
	
	/**
	 * 
	 * @param id
	 * @return Student
	 * call the findById() method of repository to get single student record
	 * id being passed in the url as path variable
	 */
	@GetMapping("/stud/{id}")
	public Student getStudById(@PathVariable("id") long id) {
		
		Optional<Student> stud = repository.findById(id);
		
		if(stud.isPresent()) {
			return stud.get();
		}
		else {
			return null;
		}
	}
	
	@PostMapping("/stud")
	public Student getStud(@RequestBody long id) {
		
		Optional<Student> stud = repository.findById(id);
		
		if(stud.isPresent()) {
			return stud.get();
		}
		else {
			return null;
		}
	}
	
	/**
	 * 
	 * @param id
	 * @param stud
	 * this method is used to fetch a student record first and then update it
	 * with the values being passed in request body.
	 */
	@PutMapping("/stud/{id}")
	public void updateUser(@PathVariable("id") long id, @RequestBody Student stud) {
		
		Optional<Student> oldData = repository.findById(id);
		if(oldData.isPresent()) {
			Student std = oldData.get();
			std.setAge(stud.getAge());
			std.setGrade(stud.getGrade());
			std.setStudName(stud.getStudName());
			repository.save(std);
		}
		else {
			System.out.println("No Data Found");
		}
		
	}
}

