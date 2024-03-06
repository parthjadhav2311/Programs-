package com.parth.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling1 {
	
	public static void main(String[] args) {
		
		try {
			 File Obj = new File("myFile.txt");
			 if(Obj.createNewFile()) {
				 System.out.println("File created : "+ Obj.getName());
				 
			 }
			 else {
				 System.out.println("File Already Exists.");
			 }
		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}

}
