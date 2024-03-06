package com.parth.Vector;

import java.util.Vector;

public class VectorDemo3 {
	
	public static void main(String[] args) {
		
		Vector vector = new Vector(5,7);
		
		System.out.println("Capacity : " + vector.capacity());
		System.out.println("Size :" + vector.size());
		
		
		vector.add(123);
		vector.add("Hii Sai");
		vector.add("Hello");
		vector.add("Hello");
		vector.add("Hello");
		vector.add("Hello");
		
		System.out.println("Capacity : "+ vector.capacity());
		System.out.println("Size : "+ vector.size());
	
		
	}

}
