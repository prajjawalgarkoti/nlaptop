package com.pack.airline.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
@Id
@Column
private int id;
private String name;
private String Branch;
//public Student(long id, String name, String branch) {
//	super();
//	this.id = id;
//	this.name = name;
//	Branch = branch;
//}
//public Student() {
//	super();
//	// TODO Auto-generated constructor stub
//}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBranch() {
	return Branch;
}
public void setBranch(String branch) {
	Branch = branch;
}
//@Override
//public String toString() {
//	return "Student [id=" + id + ", name=" + name + ", Branch=" + Branch + ", getId()=" + getId() + ", getName()="
//			+ getName() + ", getBranch()=" + getBranch() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
//			+ ", toString()=" + super.toString() + "]";
//}


}
