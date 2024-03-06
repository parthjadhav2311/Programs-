package com.parth.Arraylist;

import java.util.LinkedList;

public class LinkedListDemo {


		public static void main(String[] args) {
			
		LinkedList l = new LinkedList();
		
		l.add("Sai");
		l.add(30);
		l.add(null);
		l.add("Sai");
		l.set(0, "Software");
		l.add(0,"Parth");
		l.removeLast();
		l.addFirst("CCC");
		System.out.println(l); 
		}
		}

