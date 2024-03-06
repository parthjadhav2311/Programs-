package com.parth.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		q.add(6);
		q.add(1);
		q.add(8);
		q.add(4);
		q.add(7);
		
		System.out.println("The queue is: " + q);
		int num1 = q.remove();
		
		System.out.println("The Element deleted from the head is: " + num1);
		
		System.out.println("The Queue after deletion is: " + q);
		int head = q.peek();
		 
		System.out.println("The Head Of the Queue is:" + head);
		int size = q.size();
		
		System.out.println("The size of ther Queue is:" + size);
	}

}
