package com.ims.demo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	
	public Student(){ }
	
	@Column
	private String name;
	public String getName(){return name;}
	public void setName(String name){this.name = name;}
	
	@Column
	private String phone;
	public String getPhone(){return phone;}
	public void setPhone(String phone){this.phone = phone;}
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Subject> subjects= new HashSet<>();
	public Set<Subject> getSubjects(){return subjects;}
	public void setSubjects(Set<Subject> subjects){this.subjects = subjects;}
	
	}