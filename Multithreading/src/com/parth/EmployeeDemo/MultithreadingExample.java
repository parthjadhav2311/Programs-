package com.parth.EmployeeDemo;

public class MultithreadingExample {

	 public static void main(String[] args) {
	        Employee employee1 = new Employee("Shraddha", 1003);
	        Employee employee2 = new Employee("Parth", 07);

	        WorkTask task1 = new WorkTask(employee1);
	        WorkTask task2 = new WorkTask(employee2);

	        // Start two threads to simulate work tasks
	        task1.start();
	        task2.start();
	    }
	
}
