package com.day4.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4.repository.StudentRepo;
import com.day4.entity.Student;
import com.day4.service.StudentService;

@Service
public class ServiceIMPL implements StudentService{
	
	@Autowired
    StudentRepo studentRepository;

	@Override 
	public List<Student> getAllStudents(){
		
		List<Student> list = studentRepository.findAll();		
		return list;
		
	}
	
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
	
	@Override
	public Student getById(int id) {
		return studentRepository.findById(id).get();
		
	}
	
	@Override
	public void deleteById(int id) {
	    studentRepository.deleteById(id);
	}
}
