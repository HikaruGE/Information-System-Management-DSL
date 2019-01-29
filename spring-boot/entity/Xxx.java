package entity;

import javax.persistence.*;
//import others, todo

@Entity
public class Xxx{

	@Id
	@GeneratedValue
	private Long id;
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	
	public Xxx(){ }
	
	}