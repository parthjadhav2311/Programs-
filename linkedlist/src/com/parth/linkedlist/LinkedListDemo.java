package com.parth.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList<>();
		
		ll.add(1233);
		
		ll.add("Hello Sai");
		
		ll.add(1233);
		
		ll.add("Hii-Parth");
		ll.add(null);
		
		System.out.println(ll);
		
		System.out.println(ll.get(0));
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>");
		
		Iterator itr = ll.descendingIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		
		ListIterator Itr = ll.listIterator(2);
		
		while(Itr.hasNext())
		{
			System.out.println(Itr.next());
		}
		
	}

}
