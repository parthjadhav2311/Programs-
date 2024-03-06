package com.parth.Generics;

public class GenericMethodDemo2 {
	
	public <T> boolean m1(T t) {
		// some logic
		System.out.println(t.getClass().getName());
		return false;
		
	}
	
	public <T extends Number > double average(T[] array) {
	double sum = 0.0;
	for(T element : array) {
		sum += element.doubleValue();
	}
	return sum   /array.length;
	}
	
	public static void main(String[] args) {
		
		GenericMethodDemo2 obj = new GenericMethodDemo2();
		obj.m1("Hello");
		
		Integer[] nums = {10,20,30,40,50};
		Long[] nums1 = {10L,20L,30L,40L,50L};
		String[] words = {"AAA","BBB","CCC"};
		
		System.out.println("Average is");
	}
	
	

}
