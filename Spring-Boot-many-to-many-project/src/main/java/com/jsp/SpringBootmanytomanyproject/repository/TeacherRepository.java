package com.jsp.SpringBootmanytomanyproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.jsp.SpringBootmanytomanyproject.dto.Student;
import com.jsp.SpringBootmanytomanyproject.dto.Teacher;

@Component
public interface TeacherRepository extends JpaRepository<Teacher, Integer>{

	// custom query for teacher
	public Teacher findByTeacherId(int teacherId);
	
	
	
}
