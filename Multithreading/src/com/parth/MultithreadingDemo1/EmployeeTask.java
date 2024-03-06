package com.parth.MultithreadingDemo1;

public class EmployeeTask implements Runnable {
	private String employeeName;
	private String task;
	
	public EmployeeTask(String employeeName, String task ) {
		 this.employeeName = employeeName;
		 this.task = task;
	}

	@Override
	public void run() {
		System.out.println(employeeName + " is performing task: \" + task");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(employeeName + "completed task: " + task);
		
	}
	

}
