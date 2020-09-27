package com.example.webday3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webday3.model.Student;
import com.example.webday3.service.IStudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	private IStudentService studentService;

	@Autowired
	public StudentController(IStudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping("/insert/name/{name}/age/{age}")
	public Student insertStudent(@PathVariable String name, @PathVariable int age) {
		Student student = new Student();
		student.setName(name);
		student.setAge(age);
		studentService.insert(student);
		return student;
	}

	@GetMapping("/{studentId}")
	public Student findById(@PathVariable Long studentId) {
		return studentService.findById(studentId);
	}
}
