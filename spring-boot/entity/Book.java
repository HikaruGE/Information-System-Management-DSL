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
	
	@Column
	private String tittle;
	public String getTittle(){return tittle;}
	public void setTittle(){this.tittle = tittle;}
	
	@Column
	private String description;
	public String getDescription(){return description;}
	public void setDescription(){this.description = description;}
	
	@ManyToMany(fetch = FetchType.EAGER,mappedBy="books")
	private Set<Author> authors= new HashSet<>();
	public Set<Author> getAuthors(){return authors;}
	public void setAuthors(){this.authors = authors;}
	
	}