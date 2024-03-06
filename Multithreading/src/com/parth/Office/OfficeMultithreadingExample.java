package com.parth.Office;

public class OfficeMultithreadingExample {
     public static void main(String[] args) {
    	 
   OfficeTask task1 = new OfficeTask("Employee 1", "Preparing Report");
   OfficeTask task2 = new OfficeTask("Employee 2","Meeting with Clients");
   OfficeTask task3 = new OfficeTask("Employee 3", "Data Analysis");
   
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
   
	System.out.println("All office taks have been completed");
}
}
