package com.example.react.model;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
    private int grade;
      
    public Student()
    {
    	
    }
    
    public Student(int id, String name, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
    
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
//	}
	
}
