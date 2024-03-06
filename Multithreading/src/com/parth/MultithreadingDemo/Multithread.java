package com.parth.MultithreadingDemo;

public class Multithread {

	public static void main(String[] args) {
		int n = 7;
		for(int i = 0; i < n; i++) {
			Thread object = new Thread(new MultithreadingDemo());
			object.start();
		}
	}
}
