package com.parth.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {

	public static void main(String[] args) {

		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost;3306/clg_db","root","Sai@2311");
			// create statement

			PreparedStatement pstmt = con.prepareStatement("insert into student values(?,?)");
			
			pstmt.setInt(1, 1);
			pstmt.setString(2, "Parth");
			
			//execute query
			
			int res=pstmt.executeUpdate();
			if(res>0)
			{
				System.out.println("Row inserted succesfully");
			}
			else {
				System.out.println("Row is not inserted");
			}
		} catch (Exception e) {
	
			e.printStackTrace();
		}

	}

}
