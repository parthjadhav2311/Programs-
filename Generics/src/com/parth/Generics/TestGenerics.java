package com.parth.Generics;

public class TestGenerics {
	
 public static<E>void printArray(E[]elements) {
	 for(E element: elements) {
		 System.out.println(element);
	 }
	 System.out.println();
 }
 
 public static void main(String[] args) {
	 Integer[] intArray = {10,20,30,40,50};
	 Character[] charArray = {'P','A','R','T','H'};
	 
	 System.out.println("Printing Integer Array");
	 printArray(intArray);
	 
	 System.out.println("Priting Character Array");
	 printArray(charArray);
	}

}
