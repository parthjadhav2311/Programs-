package com.parth.Array1;

public class Candidate {
	
	private int rollnumber;
	private String name;
	
	public Candidate() {
		super();
	}
	
	public Candidate(int rollnumber, String name) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
	}
	
	public int getRollNumber() {
		return rollnumber;
	}
	
	public void setRollNumber(int rollNumber) {
		this.rollnumber = rollNumber;
    }
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
    public String toString() {
		return "Candidate[rollNumber=" + rollnumber + ", name=" + name + "]";
	}
	
	
	
	
	

}
