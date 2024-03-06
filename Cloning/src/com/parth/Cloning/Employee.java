package com.parth.Cloning;

public class Employee implements Cloneable {
	
	private int id;
	private String name;
	private String address;
	
	public Employee() {
		super();
		
	}
	
	public Employee(int id, String name,String address) 
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		
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
	
	public String getAddress() {
		return address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id +",name="+name+",address="+address + "]";
	}
	
	protected Object clone() throws CloneNotSupportedException {
		     return super.clone();
	}

}
