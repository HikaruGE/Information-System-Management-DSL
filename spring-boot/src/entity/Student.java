package entity;

import javax.persistence.*;
//import others, todo

@Entity
public class Student{

	@Id
	@GeneratedValue
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
	
	}