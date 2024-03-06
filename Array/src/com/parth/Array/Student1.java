package com.parth.Array;

// java program to illustrate creating
//  an array of objectspackage com.parth.Array;

public class Student1 {
	
	public String name;
	Student1(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
		
	}

public static void main(String[] args) {
		Student1[] mystudents = new Student1[]{new Student1("Parth"),new Student1("Shraddha"),new Student1("Arati"),new Student1("Sai")};
		for(Student1 m:mystudents) {
			System.out.println(m);
			
		}
	}
}
	
