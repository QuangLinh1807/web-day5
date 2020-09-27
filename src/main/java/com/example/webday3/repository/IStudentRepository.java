package com.example.webday3.repository;

import com.example.webday3.model.Student;

public interface IStudentRepository {

	public void insert(Student s);

	public Student update(Student s);

	public Student findById(long id);
}
