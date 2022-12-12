package com.pack.airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.airline.entities.Student;
import com.pack.airline.sevices.Studentservice;

@RestController
public class mycontroller {
	@Autowired 
	private Studentservice Studentservice;
	
	@GetMapping("/Student")
	public List<Student> getStudent() {
		return this.Studentservice.getStudent();
	}
	@GetMapping("/Student/{StudentId}")
	public Student getStudent(@PathVariable int StudentId) {
		return this.Studentservice.getStudent(StudentId);
	}
	@PostMapping("/Student")
	public Student addStudent(@RequestBody Student Student) {
		return this.Studentservice.addStudent(Student);
	}
	@PutMapping("/Student")
	public Student updateStudent(@RequestBody Student Student) {
		return this.Studentservice.updateStudent(Student);
	}
	@DeleteMapping("/Student/{StudentId}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable int StudentId){
		try {
			this.Studentservice.deleteStudent(StudentId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
	catch(Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
		
	}
}

