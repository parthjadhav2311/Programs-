package com.prowings.ExceptionHandling;

public class NestedTryCatch4 {
	
	public static void main(String[] args) {
		System.out.println("Main started!!");
		
		try {
			System.out.println("Outer try");
			int res = 30/0; //Arithmatic
		}
		catch (ArithmeticException e) {
			System.out.println("Inside outer catch");
			try {
				//some code
			}catch (NullPointerException e1) {
				//TODO: handle exception
			}
			finally
			{
				System.out.println("Inside outer finally");
			}
			
			System.out.println("Main ended");
		}
	}

}
