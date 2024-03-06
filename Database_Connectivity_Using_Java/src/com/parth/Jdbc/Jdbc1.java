package com.parth.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Jdbc1 {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost;3306/clg_db","root","Sai@2311");
			
			PreparedStatement ps = con.prepareStatement("insert into student values(?, ?, ?,?)");
			Scanner sc = new Scanner(System.in); System.out.println("enter id = ");
			int id = sc.nextInt();
			ps.setInt(1, id);
			
			System.out.println("enter name = ");
			String name = sc.next();
			ps.setString(2, name);
			
			System.out.println("enter subject = ");
			String Subject = sc.next();
			ps.setString(3, Subject);
			
			System.out.println("enter roll = ");
			String roll = sc.next();
			ps.setString(4, roll);
			
			int res = ps.executeUpdate();
			
			if(res > 0) {
				System.out.println("Row is Inserted");
			} else {
				System.out.println("row is not Inserted");
			}
			
	  } catch (Exception e ) {
		  e.printStackTrace();
	  }
	}

}
