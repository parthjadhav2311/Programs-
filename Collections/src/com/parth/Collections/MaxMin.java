package com.parth.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMin {
	
	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("zzz");
		myList.add("ddd");
		myList.add("aaa");
		myList.add("ccc");
		
		System.out.println("Original List : "+myList);
		
		String minString = Collections.min(myList);
		
		System.out.println("Minimum element : "+minString);

		String maxString = Collections.max(myList);
		
		System.out.println("Maximum element : "+maxString);
		
	}

}
