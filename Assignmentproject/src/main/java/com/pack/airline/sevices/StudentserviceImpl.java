package com.pack.airline.sevices;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.airline.dao.Studentdao;
import com.pack.airline.entities.Student;

@Service
public class StudentserviceImpl implements Studentservice {
	@Autowired
	private Studentdao Studentdao;

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return Studentdao.findAll();
	}

	@Override
	public Student getStudent(int StudentId){
		// TODO Auto-generated method stub
		return Studentdao.findById(StudentId).get();
	}
	public Student addStudent(Student Student) {
		// TODO Auto-generated method stub
		Studentdao.save(Student);
		return (Student);
	}
	public Student updateStudent(Student Student) {
		// TODO Auto-generated method stub
		Studentdao.save(Student);
		return (Student);
	}
	public void deleteStudent(int  id) {
		Student entity=Studentdao.findById(id).get();
		Studentdao.delete(entity);
	}
	
}