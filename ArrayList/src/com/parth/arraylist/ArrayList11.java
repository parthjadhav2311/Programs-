package com.parth.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList11 {
	public static void main(String[] args) {
		
ArrayList<String> list=new ArrayList<String>();
	list.add("Sai");
	list.add("Parth");
	list.add("Vaibhav");
	list.add("Yash");
	
	Iterator itr = list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}

}
