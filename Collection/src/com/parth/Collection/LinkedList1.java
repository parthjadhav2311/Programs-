package com.parth.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	
	public static void main(String[] args) {
		
		LinkedList<String> al = new LinkedList<String>();
		
		al.add("Parth");
		al.add("Sai");
		al.add("Jay");
		al.add("Shree");
		al.add("Ram");
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
