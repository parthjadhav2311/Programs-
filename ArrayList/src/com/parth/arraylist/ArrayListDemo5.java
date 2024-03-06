package com.parth.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo5 {
	
	public static void main(String[] args) {
		
		ArrayList all = new ArrayList();
		
		all.add("Hello Sai");
		all.add(123);
		all.add("Hi Parth");
		all.add(123);
		
		Iterator itr = all.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(">>>>>>>>>>>>>>");
		
		ListIterator Itr = all.listIterator(3);
		
		while(Itr.hasPrevious())
		{
			System.out.println(Itr.previous());
		}
	}

}
