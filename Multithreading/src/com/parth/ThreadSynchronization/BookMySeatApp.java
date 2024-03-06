package com.parth.ThreadSynchronization;

public class BookMySeatApp {
	
	public static void main(String[] args) {
		
		Theater theater = new Theater();
		
		MyThreadOne t1 = new MyThreadOne(theater,5);
		MyThreadOne t2 = new MyThreadOne(theater,6);
		
		t1.setName("Parth");
		t2.setName("Sai");

		t1.start();
		t2.start();
	
	}

}
