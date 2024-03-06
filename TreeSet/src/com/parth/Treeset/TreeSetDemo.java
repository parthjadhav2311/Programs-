package com.parth.Treeset;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet  t = new TreeSet(new MyComparator());
		
		  t.add("Pooja");
		  t.add("Shraddha");
		  t.add("Parth");
		  t.add("Sai");
		  
		 System.out.println(t);
		  
		  
	}
}
