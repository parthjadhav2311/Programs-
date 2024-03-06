package com.prowings.ExceptionHandling;

public class TryCatchDemo2 {
	
	public static void main(String[] args) {
		
		System.out.println("Hii Sai");
		System.out.println("Hii Sai");
		System.out.println("Hii Sai");
		
		int res = 0;
		
		int[] num= {0,20,30,40,50};
		
		try {
			   res = num[2]/0;
			   System.exit(0);
			   System.out.println("Result is : " + res);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException!!!");
		}
	    catch (ArithmeticException e) {
			System.out.println(">>>>>>>>>>>>>>>ArithmeticException!!!");
		}
		catch(Exception e)
		{
			System.out.println("Exception caught in Exception Catch Block!!");
		}
		finally {
			System.out.println("inside finallyblock!!!");
		}
		
		System.out.println("Hiii Parth");
		System.out.println("Hiii Parth");
		System.out.println("Hiii Parth");
		
		
	}

}
	