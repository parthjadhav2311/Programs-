package com.prowings.Static;

public class Static {
	
	static int a = m11();
	
	static
	{
		System.out.println("Inside static Block");
	}
	
	static int m11()
	{
		System.out.println("From m1");
		return 20;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Value of a : " + a);
		System.out.println("from main");
	}

}	 