package com.parth.arraylist;

import java.util.ArrayList;

public class ArrayListDemo6 {
	
	public static void main(String[] args) {
		
		ArrayList all = new ArrayList();
		
		
	    all.add("Hello Sai");
		all.add(123);
		all.add("Hii Parth");
		all.add(123);
		all.add(2);
		
		Integer x = 2;
		
		System.out.println(all.get(0));
		
		all.add(2,"zzzz");
		System.out.println(all);
		
		all.remove(x);
		System.out.println("after remove:"+all);
		
		System.out.println(all.lastIndexOf(123));
		
}
}