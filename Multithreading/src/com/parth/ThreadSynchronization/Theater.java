package com.parth.ThreadSynchronization;

public class Theater {
	
	int totalSeats = 10;
	
	public synchronized void bookSeats(int seats)
	{
		System.out.println("Hii : " + Thread.currentThread().getName());
		System.out.println("Hii : " + Thread.currentThread().getName());
		System.out.println("Hii : " + Thread.currentThread().getName());
		
	//	synchronized (this)
	//	{
			if(seats <= totalSeats)
			{
				System.out.println(seats + "Seats booked successfully by : " + Thread.currentThread().getName());
				totalSeats = totalSeats - seats;
				System.out.println("Remaining seats after booking : " + totalSeats);
			}
			
			else
			{
				System.out.println("Can not Book : "+seats+ "seats..Available are : "+totalSeats);
			}
	//	}
		
		System.out.println("Hello : " + Thread.currentThread().getName());
		System.out.println("Hello : " + Thread.currentThread().getName());
		System.out.println("Hello : " + Thread.currentThread().getName());
		
	}

}
