package com.parth.Exam;

public class Exam implements Runnable{
	private String studentName;
	private String course;
	
	public Exam (String studentName , String course) {
		this.studentName = studentName;
		this.course = course;
	}

	@Override
	public void run() {
		System.out.println(studentName + " is taking the exam in :" + course);
		
	}

}
