package com.parth.arraylist;

import java.util.ArrayList;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		
		ArrayList all = new ArrayList();
		
		System.out.println(">>> Empty "+all.isEmpty());

		 all.add("Hello");
		 all.add(123);
		 System.out.println(all.add("Hii Sai"));
		 
		 
		 System.out.println(all);
		 System.out.println(">>> empty "+all.isEmpty());
		 
		 ArrayList a12 = new ArrayList();
		 
		 a12.add(all);
		 a12.add(345);
		 a12.add(456);
		 System.out.println(a12);
		 
		 System.out.println(a12.remove("Hii "));
		 
	//	 a12.removeAll(all);
	//	 a12.retainAll(all);
		 
		 System.out.println(a12.contains("Hello Sai"));
		 System.out.println(a12.containsAll(all));
		 
		 System.out.println(a12);
		 
		 a12.clear();
		 
		 System.out.println("After clear :"+a12);
		 
		 System.out.println();
	}

}
