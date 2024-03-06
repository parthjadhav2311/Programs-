package com.parth.Map;

import java.util.HashMap;
import java.util.Map;

public class ChangingElementsofMap {
	
	public static void main(String[] args) {
		
		Map<Integer,String>m1 = new HashMap<Integer,String>();
		
		//Adding Elements
		
		m1.put(new Integer(1),"Hii");
		
		m1.put(new Integer(2),"Parth");
		
		m1.put(new Integer(3),"Jadhav");
		
		System.out.println("Map Before Change" + m1);
		
		m1.put(new Integer(1), "Welcome");
		
		System.out.println("Map After change" + m1);
	}

}
