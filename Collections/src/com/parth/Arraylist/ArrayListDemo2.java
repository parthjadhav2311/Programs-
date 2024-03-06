package com.parth.Arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		
		ArrayList I = new ArrayList();
		
		I.add("A");
		I.add(9);
		I.add("B");
		I.add(null);
		System.out.println(I);
		
		I.remove(3);
		System.out.println(I);
		
		I.add(2,"M");
		I.add("N");
		System.out.println(I);
		
	}

}
