package com.jsp.SpringBootmanytomanyproject.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.SpringBootmanytomanyproject.dto.Student;
import com.jsp.SpringBootmanytomanyproject.dto.Teacher;
import com.jsp.SpringBootmanytomanyproject.repository.StudentRepository;
import com.jsp.SpringBootmanytomanyproject.repository.TeacherRepository;

@Repository
public class StudentDao {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	// insert Student--------------------------------------------------------------------------
	public List<Student> insertStudentTeacher(List<Student> student) {
		return studentRepository.saveAll(student);
	}
	
//	public List<Student> getStudentId(int studentId){
//		Optional<Student> optional = studentRepository.findById(studentId);
//		
//		if(optional.isPresent()) {
//			List<Student> student = (List<Student>) optional.get();
//			return student;
//		}else {
//			return null;
//		}
//		
//	}
	
	// getStudentDataByTeacherId-----------------------------------------------------------------
	public Teacher getStudentDataByTeacherId(int teacherId) {
		return teacherRepository.findByTeacherId(teacherId);
	}
	
	// getTeacherDataByStudentId-----------------------------------------------------------------
	public Student getTeacherDataByStudentId(int studentId) {
		return studentRepository.findByStudentId(studentId);
	}	
	
	// deleteStudentId----------------------------------------------------------------------------
	public void deleteStudentById(int studentId) {
		Optional<Student> optional = studentRepository.findById(studentId);
		if(optional.isPresent()) {
			Student student = optional.get();
			studentRepository.delete(student);
		}
	}
	
}
