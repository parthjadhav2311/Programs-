package com.prowings.ExceptionHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ThrowsDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		System.out.println("Main started");
		m1();
		System.out.println("Main ended");
		
	}

	public  static void m1() throws CloneNotSupportedException {
		System.out.println("m1 started");
		try {
			m2();
		} catch (IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("m1 ended");
		
	}


	public  static void m2() throws IOException, CloneNotSupportedException {        
		System.out.println("m2started");
		m3();
		System.out.println("ended");
}

	public  static void m3() throws IOException, CloneNotSupportedException {
		System.out.println("m3 started");
		//risky code
		File file = new File("");
		FileWriter filewriter = new FileWriter(file);
		ThrowsDemo obj = new ThrowsDemo();
		obj.clone();
		
		
		System.out.println("m3 ended");
		
	}
}
