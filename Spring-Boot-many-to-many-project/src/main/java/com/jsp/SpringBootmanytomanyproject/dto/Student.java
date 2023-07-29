package com.jsp.SpringBootmanytomanyproject.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	private int studentId;
	private String studentName;
	private String studentEmail;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name="student-teacher",
			joinColumns= {
					@JoinColumn(name="studentid"),
			},
			inverseJoinColumns = { 
					@JoinColumn(name="teacherid")
			}
	)
	@JsonBackReference
	private List<Teacher> teachers;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	} 
	
}
