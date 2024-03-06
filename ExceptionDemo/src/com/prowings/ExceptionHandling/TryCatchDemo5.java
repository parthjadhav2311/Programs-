package com.prowings.ExceptionHandling;

public class TryCatchDemo5 {
	
	public static void main(String[] args) {
		
		System.out.println("Main method started!!");
		
		
		try
		{
			System.out.println("Inside try");
			int res = 10/0;
			
			try
			{
				System.out.println("Inside nested try");
				System.exit(0);
			}
			catch(Exception e)
			{
				System.out.println("Inside nested catch");
			}
			finally {
				System.out.println("Inside nested finally");
			}
		}
		catch(Exception e) {
			System.out.println("Inside catch");
		}
		finally {
			System.out.println("Inside finally");
		}
		
		System.out.println("Main method ended");
	}

}
