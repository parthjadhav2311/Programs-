package com.parth.arraylist;

import java.util.ArrayList;

public class ArrayListDemo4 {
	
	public static void main(String[] args) {
		
		ArrayList all = new ArrayList();
		
		all.add("Hello");
		all.add(123);
		
		System.out.println(all);
		
		ArrayList a12 = new ArrayList();
	
		a12.add("Hello");
		a12.add(123);
		
		System.out.println(a12.hashCode());
		System.out.println(all.hashCode());
		
		System.out.println(all.equals(a12));
	}
	
	

}
