package com.gl.lab6.service;

import java.util.List;

import com.gl.lab6.entity.Student;

public interface StudentService {
	
	public List<Student> findAll();

	public Student findById(Integer theId);

	public void save(Student student);

	public  void delete(Student student);

}
