package com.parth.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo8 {

	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("aaa");
		myList.add("zzz");
		myList.add("ddd");
		myList.add("aaa");
		myList.add("ccc");
		myList.add("aaa");
		
		System.out.println("Original List : "+myList);
		
		if(Collections.replaceAll(myList,"aaa", "xxx"))
			   System.out.println("After ReplaceAll : "+myList);
		
		else
			System.out.println("No Element Found for replace!!");
	}
}
