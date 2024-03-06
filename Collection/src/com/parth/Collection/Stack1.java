package com.parth.Collection;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
	
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("Parth");
		stack.push("Sai");
		stack.push("Jay");
		stack.push("Shree");
		stack.push("Pramod");
		
		stack.pop();
		
		Iterator<String> itr = stack.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		
	}

}
