package com.prowings.ExceptionHandling;

public class TryCatchDemo3 {
	
	public static void main(String[] args) {
		
		int res = divide(10,2);
		System.out.println("Result is : " + res);
	}

	public static int divide(int i, int j) {
		int result =0;
		try {
			result = i/j;
			return 10;
		}catch (ArithmeticException e) {
			System.out.println("Inside catch block!!!");
			
			return 20;
		} finally {
			System.out.println("Inside finally block!!!");
			return 30;
		}
	}

}
