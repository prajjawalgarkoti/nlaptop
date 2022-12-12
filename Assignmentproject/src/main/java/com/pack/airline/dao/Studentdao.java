package com.pack.airline.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.airline.entities.Student;

public interface Studentdao extends JpaRepository<Student, Integer> {
	

}
