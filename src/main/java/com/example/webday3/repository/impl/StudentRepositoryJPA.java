package com.example.webday3.repository.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.webday3.model.Student;
import com.example.webday3.repository.IStudentRepository;

@Repository
public class StudentRepositoryJPA implements IStudentRepository {

	private EntityManager em;

	@Autowired
	public StudentRepositoryJPA(EntityManager em) {
		this.em = em;
	}

	@Override
	public void insert(Student s) {
		em.persist(s);
	}

	@Override
	public Student update(Student s) {
		return em.merge(s);
	}

	@Override
	public Student findById(long id) {
		return em.find(Student.class, id);
	}

}
