package com.parth.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo4 {
	
	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("zzz");
		myList.add("add");
		myList.add("aaa");
		myList.add("ccc");
		
		System.out.println("Before Shuffle : "+ myList);
		Collections.shuffle(myList);
		System.out.println("After Shuffle : "+ myList);
		
		System.out.println("Before swap: "+myList);
	     Collections.swap(myList, 0, 3);
	     System.out.println("After swap : "+myList);
	     
	     Collections.fill(myList, "XXX");
	     System.out.println("After fill: "+myList);
	     
	     
	}

}
