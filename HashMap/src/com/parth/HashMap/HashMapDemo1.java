package com.parth.HashMap;

import java.util.HashMap;

public class HashMapDemo1 {
	public static void main(String[] args) {
		
			HashMap<String ,Integer> mymap = new HashMap<>();
			
			System.out.println(mymap.size());
			System.out.println(mymap.isEmpty());
			
			System.out.println(mymap.put("AAA", 123));
			System.out.println(mymap.put("AAA", 321));
			System.out.println(mymap.put("null", 456));
			System.out.println(mymap.put("null", 007));
			System.out.println(mymap.put("BBB", null));
			System.out.println(mymap.put("CCC", 567));
			System.out.println(mymap.put("DDD", 567));
			
			System.out.println(mymap.size());
			System.out.println(mymap.isEmpty());
			
			
			
	}

}
