package com.prowings.ExceptionHandling;

//Exception Handling using try catch

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			
			int dividedByZero = 5 / 0;
			System.out.println("Code in try block");
		}
		
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}
		
	}

}
