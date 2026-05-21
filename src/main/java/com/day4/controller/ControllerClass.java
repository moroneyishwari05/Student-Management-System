package com.day4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.day4.entity.Student;

import com.day4.service.StudentService;

@Controller
public class ControllerClass {
	
	@Autowired
	public StudentService service;
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student = new Student();
		
		model.addAttribute("student", student);
		return "create-student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		service.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable int id, Model model) {
		model.addAttribute("student", service.getById(id));
		return "edit-student";
		
	}
	
	@PostMapping("/students/edit/{id}")
	public String UpdateStudent(@PathVariable int id, @ModelAttribute("students") Student student) {
		
		Student existingStudent = service.getById(id);
		
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		return "redirect:/students";
		
	}
	
	@GetMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable int id) {

        service.deleteById(id);

        return "redirect:/students";
    }
	
	@GetMapping("/students")
	public String getAllStudents(Model model) {
		
		model.addAttribute("students", service.getAllStudents());
		return "students";
		
	}
	

}
