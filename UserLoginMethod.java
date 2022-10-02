package com.admin.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UserLoginMethod {
	public ResultSet getUserloginMethod() {
		PreparedStatement ps=null;
		ResultSet rs =null;
		try {
			Scanner sc = new Scanner(System.in); 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root",
					"shubham@deman");
			ps = con.prepareStatement("Select userid from user where userid=? and password=?");
			System.out.println("Enter user id");
			String id = sc.next();
			System.out.println("Enter user password");
			String pass = sc.next();
			ps.setString(1, id);
			ps.setString(2, pass);
			rs = ps.executeQuery();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

}
