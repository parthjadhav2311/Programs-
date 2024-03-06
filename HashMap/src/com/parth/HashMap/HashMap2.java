package com.parth.HashMap;

import java.util.HashMap;

public class HashMap2 {
	
	public static void main(String[] args) {
		
		HashMap<String,String> Names = new HashMap<String,String>();
		
		Names.put("Parth","11");
	    Names.put("yash", "07");
	    Names.put("Sujal","45");
	    
	    for(String i : Names.keySet()) {
	   System.out.println("Key: " + i  +  "value: " + Names.get(i));
	    }
	}

}
