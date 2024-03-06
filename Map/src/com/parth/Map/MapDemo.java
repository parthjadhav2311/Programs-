package com.parth.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer,String> m1 = new HashMap<>();
		Map<Integer,String> m2 = new HashMap<Integer,String>();
		
		m1.put(1,"Welcome");
		
		m1.put(2,"To");
		
		m1.put(3,"Kolhapur");
		
		   m2.put(new Integer(1),"Welcome");
		
		  m2.put(new Integer(2),"To");
		  
		  m2.put(new Integer(3),"Kolhapur");
		  
		  System.out.println(m1);

		   System.out.println(m2);
		
	}

}
