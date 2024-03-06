package com.parth.Map;

import java.util.Map;
import java.util.TreeMap;

public class ImplementingMapInterfaceTreeMap {

	public static void main(String[] args) {
		
		//Using TreeMap class
		
		Map<String , Integer > val = new TreeMap<>();
		
		//Adding Elements
		val.put("Second",2);
		
		val.put("First", 1);
		
		val.put("Fourth", 4);
		
		val.put("Third",3);
		
		System.out.println("Map using TreeMap:"+val);

		//Replacing Elemwents
		
		val.replace("First", 11);
		
		val.replace("Third", 33);
		
		System.out.println("New Map:" +val);
		
		//Removing Elements
		
		int remVal = val.remove("First");
		
		System.out.println("The Removed value is:"+ remVal);
	
	}
}
