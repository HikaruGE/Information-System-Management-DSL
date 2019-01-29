package entity;

import javax.persistence.*;
//import others, todo

@Entity
public class Author{

	@Id
	@GeneratedValue
	private Long id;
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	
	public Author(){ }
	
	@Column
	private String name;
	public String getName(){return name;}
	public void setName(){this.name = name;}
	
	@OneToMany(fetch = FetchType.EAGER)
	private Set<Book> books= new HashSet<>();
	public Set<Book> getBooks(){return books;}
	public void setBooks(){this.books = books;}
	
	}