package com.parth.Jdbc;

public class Student {
	private int id;
	private String name;
	private String Subject;
	private int roll;

	public Student(int id, String name, String subject, int roll) {
		super();
		this.id = id;
		this.name = name;
		Subject = subject;
		this.roll = roll;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Subject=" + Subject + ", roll=" + roll + "]";
	}
	

}
