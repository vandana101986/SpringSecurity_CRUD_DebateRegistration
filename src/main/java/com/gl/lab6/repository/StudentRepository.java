package com.gl.lab6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.lab6.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
