package com.prowings.ExceptionHandling;

public class TryCatchDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Hii Sai");
		System.out.println("Hii Sai");
		System.out.println("Hii Sai");
		System.out.println("Hii Sai");
		
		int res = 0;
		
		int[] num = {10,20,30,40,50};
		
		try {
			  res = num[2]/2;
			  System.out.println("Result is : " + res);
		}
		catch (ArithmeticException e) {
			System.out.println("ArthimeticException!!!");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOfBoundsException!!!");
		}
		catch(Exception e)
		{
			System.out.println("Exception caught in Exception Catch Block!!");
		}
		finally {
			System.out.println("Inside finallyblock!!");
		}
		
		System.out.println("Hii Parth");
		System.out.println("Hii Parth");
		System.out.println("Hii Parth");
	}

}
