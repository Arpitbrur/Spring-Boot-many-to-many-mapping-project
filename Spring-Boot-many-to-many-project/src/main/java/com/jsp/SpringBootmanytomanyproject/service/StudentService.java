package com.jsp.SpringBootmanytomanyproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.SpringBootmanytomanyproject.dao.StudentDao;
import com.jsp.SpringBootmanytomanyproject.dto.Student;
import com.jsp.SpringBootmanytomanyproject.dto.Teacher;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;
	
	// insert Student--------------------------------------------------------------------------
	public List<Student> insertStudentTeacher(List<Student> student) {
		return studentDao.insertStudentTeacher(student);
	}	
	
	// getStudentDataByTeacherId-----------------------------------------------------------------
	public Teacher getStudentDataByTeacherId(int teacherId) {
		Teacher teacher= studentDao.getStudentDataByTeacherId(teacherId);
		if(teacher !=null) {
			return teacher;
		}else {
			return null;
		}
	}
	
	// getTeacherDataByStudentId-----------------------------------------------------------------
	public Student getTeacherDataByStudentId(int studentId) {
		Student student = studentDao.getTeacherDataByStudentId(studentId);
		if(student !=null) {
			return student;
		}else {
			return null;
		}
	}	
	
	// deleteStudentId----------------------------------------------------------------------------
	public void deleteStudentById(int studentId) {
		if(studentId != 0) {
			studentDao.deleteStudentById(studentId);
			System.out.println("Data deleted successfully");

		}else {
			System.out.println("given id is not deleted");

		}
	}	
}
