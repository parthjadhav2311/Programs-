package com.parth.Map;

import java.util.HashMap;
import java.util.Map;

public class IteratingThroughMap {
	
	public static void main(String[] args) {
		
		//using HashMap to create a map
		
		Map<String , Integer> num = new HashMap<>();
		
		//Adding Elements
		
		num.put("One",1);
		
		num.put("Two",2);
		
		num.put("Three",3);
		
		num.put("Four",4);
		
		System.out.println("The Complete Map:" + num);
		
		//Accessing Keys
		
		System.out.println("The keys are: " + num.keySet());
		
		//Accessing values
		
		System.out.println("The Values are: " + num.values());
		
		//Accessing Entries
		
		System.out.println("The Entries are: " + num.entrySet());
		
		//Removing elements
		
		int value = num.remove("Three");
		
		System.out.println("Value Removed: " + value);
		
		}

}
