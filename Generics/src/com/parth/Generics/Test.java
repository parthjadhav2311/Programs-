package com.parth.Generics;

public class Test {
	
	static<T> void genericDisplay(T element)
	{
		System.out.println(element.getClass().getName()+"="+element);
		
	}
	
	public static void main(String[] args) {
		genericDisplay(11);
		genericDisplay("Iam Parth Jadhav");
		genericDisplay(1.0);
	}

}
