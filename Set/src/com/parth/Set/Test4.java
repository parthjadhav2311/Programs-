package com.parth.Set;

import java.util.HashSet;

public class Test4 {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		String s1 = "Hello Sai";
		String s2 = new String ("Hello Parth");
		
		System.out.println("s1 hashcode : "+s1.hashCode());
        System.out.println("s2 hashcode : "+s2.hashCode());		
        
        
        StringBuffer s3 = new StringBuffer("Hello");
        StringBuilder s4 = new StringBuilder("Hello");
        StringBuffer s5 =  new StringBuffer("Hello");
        StringBuilder s6 = new StringBuilder("Hello");
        
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);
        hs.add(s6);
        
        
        System.out.println(hs);
	}

}
