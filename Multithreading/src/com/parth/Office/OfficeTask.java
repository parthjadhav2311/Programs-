package com.parth.Office;

public class OfficeTask implements Runnable {
    private String employeeName;
    private String task;

    public OfficeTask(String employeeName, String task) {
        this.employeeName = employeeName;
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println(employeeName + " is working on: " + task);
        try {
            // Simulate the time taken to complete the task
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(employeeName + " completed: " + task);
    }
}

	
	


