package com.parth.Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGenerics1 {
	
	public static void main(String[] args) {
		
		ArrayList<String>list = new ArrayList<String>();
		list.add("Parth");
		list.add("Sai");
		
		String s = list.get(1);
		System.out.println("Element is: " + s);
		
		
		Iterator<String> itr =list.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	}

}
