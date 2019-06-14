package com.karthik.hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name = "faculty")
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "role")
	private String role;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	public Faculty() {
	}

	public Faculty(String firstName, String role, String lastName, String email) {
		this.firstName = firstName;
		this.role = role;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", firstName=" + firstName + ", role=" + role + ", lastName=" + lastName
				+ ", email=" + email + "]";
	}

}
