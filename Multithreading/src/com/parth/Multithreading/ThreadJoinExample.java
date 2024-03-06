package com.parth.Multithreading;

public class ThreadJoinExample extends Thread{
	
	public void run() {
		for(int j=0; j<2; j++) {
			try {
				Thread.sleep(300);
				System.out.println("The Current Thread name is : " + Thread.currentThread().getName());
			}
			catch (Exception e) {
				System.out.println("The exception has been caught : " + e);
			}
			System.out.println(j);
 		}
	}

}
