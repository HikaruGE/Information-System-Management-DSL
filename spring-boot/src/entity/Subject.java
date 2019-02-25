package com.ims.demo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Subject{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	
	public Subject(){ }
	
	@Column
	private String name;
	public String getName(){return name;}
	public void setName(String name){this.name = name;}
	
	@ManyToMany(fetch = FetchType.EAGER,mappedBy="subjects")
	private Set<Student> enrollStu= new HashSet<>();
	public Set<Student> getEnrollStu(){return enrollStu;}
	public void setEnrollStu(Set<Student> enrollStu){this.enrollStu = enrollStu;}
	
	}