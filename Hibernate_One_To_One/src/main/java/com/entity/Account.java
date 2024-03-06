package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Account {
	
	@Id
	@Column(name = "acc_id")
	private int id;
	@Column(name = "acc_name")
	private String name;
	
	@OneToOne
	private Employee employee;
	
	
	
	public Employee getEmployee() {
		return employee;
	}




	public void setEmployee(Employee employee) {
		this.employee = employee;
	}




	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public Account(int id, String name, Employee employee) {
		super();
		this.id = id;
		this.name = name;
		this.employee = employee;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + "]";
	}
	
	
	
	

}
