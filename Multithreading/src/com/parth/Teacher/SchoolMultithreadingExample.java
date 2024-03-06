package com.parth.Teacher;

public class SchoolMultithreadingExample {
   public static void main(String[] args) {
	
	   TeacherTask task1 = new TeacherTask("Teacher 1" ,"History");
	   TeacherTask task2 = new TeacherTask("Teacher 2" ,"Science");
	   TeacherTask task3 = new TeacherTask("Teacher 3" ,"English");
	   
	   
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
	   
	   System.out.println("All teachers have finished their classes.");
}
}
