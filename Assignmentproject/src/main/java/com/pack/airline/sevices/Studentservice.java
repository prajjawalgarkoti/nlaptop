package com.pack.airline.sevices;

import java.util.List;

import com.pack.airline.entities.Student;

public interface Studentservice {

	public List<Student> getStudent();
	public Student getStudent(int StudentId);
	public Student addStudent(Student Student);
	public Student updateStudent(Student Student);
	public void deleteStudent(int id);
	
	
}
