package com.parth.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo7 {
	
	public static void main(String[] args) {
		
		ArrayList all = new ArrayList();
		
		all.add("Hello Sai");
		all.add(1003);
		all.add("Hii Parth");
		all.add(3181);
		all.add(2);
		
		System.out.println(all);
		
		List a12 = all.subList(2,4);
		
		System.out.println(a12);
		
		all.remove("Hii Sai-Shraddha");
		
		System.out.println(all);
	}

}
