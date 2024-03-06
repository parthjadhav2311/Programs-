package com.parth.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
	ArrayList<String> list = new ArrayList<String>();
	
	list.add("Sai");
	list.add("Jay");
	list.add("Shree");
	list.add("Ram");
	
	Iterator itr = list.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	  }
	}

}
