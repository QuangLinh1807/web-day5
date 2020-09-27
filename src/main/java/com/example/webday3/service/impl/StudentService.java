package com.example.webday3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.webday3.model.Student;
import com.example.webday3.repository.IStudentRepository;
import com.example.webday3.service.IStudentService;

@Service
public class StudentService implements IStudentService {

	private IStudentRepository studentRepository;

	@Autowired
	public StudentService(IStudentRepository studentRepositoryJPA) {
		this.studentRepository = studentRepositoryJPA;
	}

	@Override
	@Transactional
	public void insert(Student s) {
		studentRepository.insert(s);
	}

	@Override
	public Student findById(Long id) {
		return studentRepository.findById(id);
	}

}
