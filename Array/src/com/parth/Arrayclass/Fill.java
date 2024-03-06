package com.parth.Arrayclass;

import java.util.Arrays;

public class Fill {
	
	public static void main(String[] args) {
		int intArr[] = { 10,20,15,22,35 };
		
		int intkey = 22;
		
		Arrays.fill(intArr, intkey);
		
		System.out.println("Integer Array on filling:"
				           + Arrays.toString(intArr));
	}

}
