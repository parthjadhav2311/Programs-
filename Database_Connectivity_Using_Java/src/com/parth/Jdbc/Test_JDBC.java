package com.parth.Jdbc;

public class Test_JDBC {

	public static void main(String[] args) {

		Student  s= new Student(7, "Amit", "c++", 70);
		
		FirstJdbc j= new FirstJdbc();
		
		int res= j.createStudent(s);
		
		if(res>0)
			System.out.println("Object added to DB..");
		
	}

}
