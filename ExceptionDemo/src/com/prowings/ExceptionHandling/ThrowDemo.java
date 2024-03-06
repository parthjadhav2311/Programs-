package com.prowings.ExceptionHandling;

public class ThrowDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Main started");
		m1();
		System.out.println("Main ended");
	}

	public static void m1() {
		System.out.println("m1 started");
		
		throw new NullPointerException();
		
    //		System.out.println("m1 ended");
		
	}

}
