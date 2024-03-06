package com.prowings.ExceptionHandling;

public class ExceptionWrapping {
	
	public static void main(String[] args) {
		System.out.println("Main started");
		myMethod(10,0);
	}

	public static void myMethod(int i, int j) {
	   
		System.out.println("myMethod started!!");
		
		try {
			int res = i/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Take some Action !!");
			NullPointerException npe = new NullPointerException("some message");
			npe.initCause(e);
			throw npe;
			
		}
		finally {
			System.out.println("Finally Executed!!");
		}
		
		System.out.println("myMethod ended!! ");
		
	}

}
