package com.parth.Arrayclass;

import java.util.Arrays;

public class DeepEquals {
	
	public static void main(String[] args) {
		
		int intArr[][] = {{10,20,15,22,35}};
		
		int intArr1[][] = {{10,15,22}};
		
		System.out.println("Integer Arrays on  : "
				            + Arrays.deepEquals(intArr, intArr1));
	}

}
