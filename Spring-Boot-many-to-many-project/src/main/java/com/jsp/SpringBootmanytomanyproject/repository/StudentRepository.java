package com.jsp.SpringBootmanytomanyproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Component;

import com.jsp.SpringBootmanytomanyproject.dto.Student;

@Component
public interface StudentRepository extends JpaRepository<Student, Integer>{

	// custom query for student
		public Student findByStudentId(int studentId);
}
