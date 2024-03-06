package com.parth.MultithreadingDemo1;

public class EmployeeMultithreadingExample {
	public static void main(String[] args) {
		EmployeeTask task1 = new EmployeeTask("Employee 1","Coding");
		EmployeeTask task2 = new EmployeeTask("Employee 2","Testing");
		EmployeeTask task3 = new EmployeeTask("Employee 3", "Desigining");
		
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		Thread thread3 = new Thread(task3);
		
		
		 thread1.start();
		 thread2.start();
		 thread3.start();
		 
		 try {
			 thread1.join();
			 thread2.join();
			 thread3.join();
	   } catch (InterruptedException e) {
		   e.printStackTrace();
	   }
		 
		 System.out.println("All employees have tasks");
	}

}
