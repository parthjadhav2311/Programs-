package com.parth.Arrayclass;

import java.util.Arrays;

public class DeepToString {
	public static void main(String[] args) {
		
		int intArr[][] = {{ 10,20,15,22,35}};
		
		System.out.println("Integer Array :"
				           + Arrays.deepToString(intArr));
	}

}
