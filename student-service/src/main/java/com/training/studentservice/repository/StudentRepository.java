package com.training.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.studentservice.model.Student;

/**
 * 
 * @author user
 * StudentRepository extends JpaRepository so that CRUD operations
 * can be performed by using Repository methods.
 */
public interface StudentRepository extends JpaRepository<Student, Long>{

}
