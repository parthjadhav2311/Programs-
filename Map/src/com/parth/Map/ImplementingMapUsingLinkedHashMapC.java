package com.parth.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class ImplementingMapUsingLinkedHashMapC {

	public static void main(String[] args) {
		
 Map<String,Integer>mp1 = new LinkedHashMap<>();
  
  mp1.put("One", 1);
  mp1.put("Two", 2);
  mp1.put("Three", 3);
  mp1.put("Four", 4);
  
  for(Map.Entry<String,Integer>m:mp1.entrySet())
	  
	  System.out.println(m.getKey()+" "+m.getValue());
 
	}
}
