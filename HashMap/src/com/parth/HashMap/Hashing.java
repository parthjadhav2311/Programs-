package com.parth.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing {
	
	public static void main(String[] args) {
		
		HashMap<String ,Integer> map = new HashMap<>();
		
		
		//Insertion
		
		map.put("India", 120);
		map.put("Us", 30);
		map.put("China", 150);
		
		
		System.out.println(map);
		
		//Re-Insert
		
		map.put("China", 7);
		System.out.println(map);
		
		
		//Search
		
		if(map.containsKey("China")) {
			System.out.println("key is present in the map");
			} else {
				System.out.println("Key is not present  in the map");
			}
		
		 
		  int arr[] = {12,15,18};
		  for(int  i = 0; i<3; i++) {
			  System.out.println(arr[i]+"");
			  }
		      System.out.println();
		      
		      for(int val : arr) {
		    	  System.out.println(val + "");
		      }
		      
		       System.out.println();
		       
		       
		  // Set      
		       
		  Set<String> keys = map.keySet();
		  for(String key : keys) {
			  System.out.println(key+ " " + map.get(key));
			  
			  
			  
		  }
		
		
	}

}
