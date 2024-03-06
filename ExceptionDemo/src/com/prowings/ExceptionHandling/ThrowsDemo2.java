package com.prowings.ExceptionHandling;

public class ThrowsDemo2 {
	
	public static void main(String[] args) {
		
		System.out.println("Main started");
		m1();
		System.out.println("Main ended ");
		
	}

	public  static void m1() {
		System.out.println("m1 started");
		m2();
		System.out.println("m1 ended");
		
	}

	public  static void m2() throws ArithmeticException, NullPointerException {
		System.out.println("m2 started");
		System.out.println("m2 ended");
		
	}

}
