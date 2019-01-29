package entity;

import javax.persistence.*;
//import others, todo

@Entity
public class Book{

	@Id
	@GeneratedValue
	private Long id;
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	
	public Book(){ }
	
	@Column
	private String name;
	public String getName(){return name;}
	public void setName(){this.name = name;}
	
	@ManyToMany(fetch = FetchType.EAGER,mappedBy="books")
	private Set<Author> authors= new HashSet<>();
	public Set<Author> getAuthors(){return authors;}
	public void setAuthors(){this.authors = authors;}
	
	}