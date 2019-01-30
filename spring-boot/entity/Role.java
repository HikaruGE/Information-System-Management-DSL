package entity;

import javax.persistence.*;
//import others, todo

@Entity
public class Role{

	@Id
	@GeneratedValue
	private Long id;
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	
	public Role(){ }
	
	@Column
	private String name;
	public String getName(){return name;}
	public void setName(){this.name = name;}
	
	}