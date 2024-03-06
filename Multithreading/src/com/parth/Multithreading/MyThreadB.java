package com.parth.Multithreading;

public class MyThreadB implements Runnable{
	
	public void run() {
		for (int j=0;j<2;j++) {
			
			try {
				Thread.sleep(3000);
				System.out.println("The Current thread name is : " + Thread.currentThread().getName());
			}
			
			catch (Exception e) {
				System.out.println("The Exception has been Caught : " + e);
			}
			
			System.out.println(j);
		}
	}

}
