package com.parth.Teacher;

public class TeacherTask  implements Runnable{
	private String teacherName;
	private String subject;
	
	
	public TeacherTask(String teacherName, String subject) {
		this.teacherName = teacherName;
		this.subject = subject;
	}
	
	@Override
	public void run() {
		System.out.println(teacherName + "is teaching" + subject);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(teacherName  + "Finished teaching " + subject);
		
	}
	
}
