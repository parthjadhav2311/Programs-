package com.parth.Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<String>();

		queue.add("Jay Shree Ram");

		queue.add("Ch.shivaji Maharaj");

		queue.add("Jay Shankar");

		queue.add("Swami Samarath");

		System.out.println("head:" + queue.element());

		System.out.println("head:" + queue.peek());

		System.out.println("iterating the queue elements:");

		Iterator itr = queue.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		queue.remove();

		queue.poll();

		System.out.println("After Removing Two Elements:");

		Iterator<String> itr2 = queue.iterator();

		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
