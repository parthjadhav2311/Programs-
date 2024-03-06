package com.prowings.ExceptionHandling;

public class NestedTryCatch2 {
	public static void main(String[] args) {
		System.out.println("Main started!!");
		
		try {
			System.out.println("Outer try");
			int res = 30/2;    //Artihmatic
			String s = null;
			s.toCharArray();  //NullPointerException
		}
		catch (NullPointerException e) {
			System.out.println("Inside outer catch");
			try {
				System.out.println("Inner Try");
				String s = null;
				s.toCharArray();    //NullPointerException
			}
			catch (ArithmeticException e1) {
				System.out.println("Iniside inner catch");
			}
			finally {
				 System.out.println("Inside inner catch");
			}
		}
		
		 System.out.println("Main ended");
	}

}
