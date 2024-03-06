package com.parth.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList<>();
		
		ll.add(1233);
		ll.add("Hello - Sai");
		ll.add(1233);
		ll.add("Hii Parth");
		ll.add(null);
		
		System.out.println("Original LinkedList : "+ ll);

		System.out.println(ll.peek());
		System.out.println("After peek() LinkedList : "+ ll);
		
		System.out.println(ll.pop());
		System.out.println("After pop() LinkedList : "+ ll);
		
		ll.push("qqq");
		System.out.println("After push() LinkedList : "+ ll);
		
		System.out.println(ll.poll());
		System.out.println("After poll() LinkedList : "+ ll);
		
	}

	
}
