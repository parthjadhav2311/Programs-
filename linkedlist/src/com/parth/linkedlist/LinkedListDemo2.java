package com.parth.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo2 {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList<>();
		
		ll.add(1233);
		ll.add("Hello Sai");
		ll.add(1233);
		ll.add("Hii Parth");
		ll.add(null);
		
		
		System.out.println("Original LinkedList : "+ ll );
		
		ll.addFirst("aaa");
		ll.addLast("zzz");
		System.out.println("LinkedList : " + ll);
		
		System.out.println(ll.element());
		
		System.out.println(">>>After Element LinkedList : "+ ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		ll.offer("zzzlll");
		System.out.println(">>>>After offer LinkedList : " + ll);
		
	}

}
