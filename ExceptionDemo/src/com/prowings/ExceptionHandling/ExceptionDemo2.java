package com.prowings.ExceptionHandling;

public class ExceptionDemo2 {
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
		myMethod();
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
	}

	public static void myMethod() {
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
		int res = 0;
		try {
			res = 10/0;
		}
		finally {
			System.out.println("Finally executed!!");
		}
		System.out.println(">>>>RES>>>"+res);
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
	}

}
