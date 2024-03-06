package com.parth.LocalInnerclass;

public class Outer {
	
	private int data = 30;
	
	public void display()
	{
		System.out.println("Display method started!!");
		final int  i = 20;
		//local inner class
		class Inner {
			public void message()
			{
				System.out.println("Inside message() method of inner class!!");
				System.out.println(i);
			}
		}
		
		         Inner in = new Inner();
		         in.message();
		         System.out.println("Display method ended!!");
		
	}
	
	public static void main(String[] args) {
		
		Outer out = new Outer();
		out.display();
	 }
	}