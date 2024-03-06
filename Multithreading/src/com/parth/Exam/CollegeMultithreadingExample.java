package com.parth.Exam;

public class CollegeMultithreadingExample {
	
	public static void main(String[] args) {
		Exam exam1 = new Exam("Student 1", " Java");
		Exam exam2 = new Exam("Student 2", " Python");
		Exam exam3 = new Exam("Student 3", " C++");
		
		
		Thread thread1 = new Thread(exam1);
		Thread thread2 = new Thread(exam2);
		Thread thread3 = new Thread(exam3);
		
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
	
	System.out.println("All exams have been completed by college students");
   }
}