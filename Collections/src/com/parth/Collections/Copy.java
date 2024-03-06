package com.parth.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Copy{
	
	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("zzz");
		myList.add("ddd");
		myList.add("aaa");
		myList.add("ccc");
		
		System.out.println("Original List : "+myList);
		
		ArrayList<String> myListCopy = new ArrayList<>();
		


		myListCopy.add("");
		myListCopy.add("");
		myListCopy.add("zzz");
		myListCopy.add("zzz");
		myListCopy.add("zzz");
		myListCopy.add("zzz");
		
		Collections.copy(myList, myList);
		
		System.out.println("Copied List : "+myListCopy);
		
		
		
	}

}
