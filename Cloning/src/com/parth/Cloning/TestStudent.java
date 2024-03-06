package com.parth.Cloning;

public class TestStudent {
	
public static void main(String[] args) {
		
		Student  std1 = new Student(07, "Sai", "Kolhapur");
		
//     Student std2 = new Student(10, "Sai", "Kolhapur");
		
	         Student std2 = null;
	
	
	try {
		 std2 = (Student) std1.clone();
		 
	} catch (CloneNotSupportedException e) {
		System.out.println("Error while cloning the object");
		e.printStackTrace();
	}
	
	System.out.println("Before changing the objects");
	System.out.println("Student 1 : " + std1);
	System.out.println("Student 2 : " + std2);
	
	System.out.println("After changing the objects");
	
	std1.setName("Parth");
	
	System.out.println("Student 1 : " + std1);
	System.out.println("Student 2 : " + std2);
	
	
	
}
	
}


