package com.parth.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Rotate1 {

	public static void main(String[] args) {
		
	//	Collections.binarySearch()
		
	ArrayList<String> myList = new ArrayList<>();
	
	 myList.add("zzz");
	 myList.add("aaa");
	 myList.add("ccc");
	 myList.add("bbb");
	 
	 System.out.println("Orginal List : "+myList);
	 
	 Collections.rotate(myList,3);
	 
	 System.out.println("After Rotation : "+myList);
	 
	}
}
