package com.parth.Multithreading;

public class MyThreadC extends Thread{

	public void run() {
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon thread work : " + Thread.currentThread().getName());
		}
		else
		{
			System.out.println("User thread work : " + Thread.currentThread().getName());
		}
		
	}
}
