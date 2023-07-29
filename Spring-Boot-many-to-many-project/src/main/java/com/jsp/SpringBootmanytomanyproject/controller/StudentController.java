package com.jsp.SpringBootmanytomanyproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.SpringBootmanytomanyproject.dto.Student;
import com.jsp.SpringBootmanytomanyproject.dto.Teacher;
import com.jsp.SpringBootmanytomanyproject.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	// insert Student--------------------------------------------------------------------------
	@PostMapping("/saveStudent")
	public List<Student> insertStudentTeacher(@RequestBody List<Student> student) {
		return studentService.insertStudentTeacher(student);
	}	
	
	// getStudentDataByTeacherId-----------------------------------------------------------------
	@GetMapping("/getStudentDataByTeacherId/{teacherId}")
	public Teacher getStudentDataByTeacherId(@PathVariable int teacherId) {
		return studentService.getStudentDataByTeacherId(teacherId);
	}	
	
	// getTeacherDataByStudentId-----------------------------------------------------------------
	@GetMapping("/getTeacherDataByStudentId/{studentId}")
	public Student getTeacherDataByStudentId(@PathVariable int studentId) {
		return studentService.getTeacherDataByStudentId(studentId);
	}	
	
	// deleteStudentId----------------------------------------------------------------------------
	@DeleteMapping("/deleteStudentById/{studentId}")
	public void deleteStudentById(@PathVariable int studentId) {
		studentService.deleteStudentById(studentId);
	}	
}
