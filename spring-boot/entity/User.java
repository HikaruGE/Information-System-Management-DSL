package entity;

import javax.persistence.*;
//import others, todo

@Entity
public class User{

	@Id
	@GeneratedValue
	private Long id;
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	
	public User(){ }
	
	@Column
	private String username;
	public String getUsername(){return username;}
	public void setUsername(){this.username = username;}
	
	@Column
	private String password;
	public String getPassword(){return password;}
	public void setPassword(){this.password = password;}
	
	@Column
	private String email;
	public String getEmail(){return email;}
	public void setEmail(){this.email = email;}
	
	@Column
	private String phone;
	public String getPhone(){return phone;}
	public void setPhone(){this.phone = phone;}
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Book> borrowedBooks= new HashSet<>();
	public Set<Book> getBorrowedBooks(){return borrowedBooks;}
	public void setBorrowedBooks(){this.borrowedBooks = borrowedBooks;}
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Role> roles= new HashSet<>();
	public Set<Role> getRoles(){return roles;}
	public void setRoles(){this.roles = roles;}
	
	}