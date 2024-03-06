package com.parth.Multithreading;

public class TestSleepMethod {
	
	public static void main(String[] args) {
		
		 MyThreadA mt = new MyThreadA();
		 
		 Thread t1 = new Thread(mt,"T1-Thread");
		 Thread t2 = new Thread(mt,"T2-Thread");
		 
		 t1.start();
		 t2.start();
	}

}
