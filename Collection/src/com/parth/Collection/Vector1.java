package com.parth.Collection;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		v.add("Sai");
		v.add("Parth");
		v.add("Vaibhav");
		v.add("Jay");
		
		Iterator<String> itr = v.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
	}

}
