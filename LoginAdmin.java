package com.admin.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LoginAdmin {
	public ResultSet getAdminloginMethod() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root",
					"shubham@deman");
			ps = con.prepareStatement("Select adminid from admin where adminid=? and password=?");
			System.out.println("Enter Admin id");
			String id = sc.next();
			System.out.println("Enter Admin password");
			String pass = sc.next();
			ps.setString(1, id);
			ps.setString(2, pass);
			rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("Password Correct...");
				/*
				  ProductAdd pa = new ProductAdd();
				 
				pa.addproduct();
				*/
				HomePage hp = new HomePage();
				hp.getHomePage();
				sc.close();
			}

			else {
				System.out.println(" Login Failed!!");
				System.out.println("Try again");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

}
