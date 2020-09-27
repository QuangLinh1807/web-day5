package com.example.webday3.service;

import com.example.webday3.model.Student;

public interface IStudentService {

	public void insert(Student s);
	
	public Student findById(Long id);

}
