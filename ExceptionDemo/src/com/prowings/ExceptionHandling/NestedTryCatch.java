package com.prowings.ExceptionHandling;

public class NestedTryCatch {
	
	public static void main(String[] args) {
		System.out.println("Main started!!");
		
		try {
			System.out.println("Outer try");
			int res = 30/0; //Arithmatic
			try {
				System.out.println("Inner try");
				String s = null;
				s.toCharArray();  //NullPointerException
			}
			catch (Exception e) {
				System.out.println("Inside inner  catch");
			}
		}
		catch (NullPointerException e) {
			System.out.println("Inisde outer catch");
		}
		finally
		{
			System.out.println("Inside outer finally");
		}
		
	}

}
