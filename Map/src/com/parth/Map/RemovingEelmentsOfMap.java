package com.parth.Map;

import java.util.HashMap;
import java.util.Map;

public class RemovingEelmentsOfMap {
	
	public static void main(String[] args) {
		
		Map<Integer,String>m1 = new HashMap<Integer,String>();
		
		m1.put(new Integer(1),"Welcome");
		
		m1.put(new Integer(2) , "To");
		
		m1.put(new Integer(3) , "Parth ");
		
		m1.put(new Integer(4),"Jadhav");
		
		m1.put(new Integer(5),"Kolhapur");
		
		
		//Map Before remove Operations
		
		System.out.println(m1);
		
		m1.remove(new Integer(4));
		
		m1.remove(new Integer(5));
		
		//Map After remove operations
		
		System.out.println(m1);
		
		
	}

}
