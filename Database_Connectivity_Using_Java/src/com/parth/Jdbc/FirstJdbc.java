package com.parth.Jdbc;

import java.sql.*;

public class FirstJdbc {

	public static void main(String[] args) {

		try {
			// 1.load the driver (optional)
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2.create connection

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3300/clg_db", "root", "Sai@2311");

			// 3.create Statement

			Statement stm = con.createStatement();

			// 4.execute Query

			ResultSet rs = stm.executeQuery("select * from student");

			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "..." + rs.getString(2) + "..." + rs.getString(3) + "..." + rs.getInt(4));
			}
			// 5.close connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int createStudent(Student s) {
		int rs=0;
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3300/clg_db", "root", "Sai@2311")) {

			Statement stm = con.createStatement();
			
			int id= s.getId();
			String nm=s.getName();
			String sb=s.getSubject();
			int rn=s.getRoll();
			
			String query="insert into student values("+id+","+"'"+nm+"'"+","+"'"+sb+"'"+","+rn+")";
			rs=stm.executeUpdate(query);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;

	}

}
