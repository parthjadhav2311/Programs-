package com.prowings.Static;

//Static Variable can be accessed directly in a static methodpackage 

// Syntax:- static data_type variable_name;

public class StaticVariable2 {
	
	static int age;
	static String name;
	//This is a Static Method
	static void disp() {
		System.out.println("Age is: "+age);
		System.out.println("Name is: "+name);
	}
	//This is also a static method
	public static void main(String[] args) {
		age = 23;
		name = "Parth";
		disp();
	}
	

}
