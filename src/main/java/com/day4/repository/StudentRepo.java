package com.day4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day4.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	List<Student> findAll();

} 
