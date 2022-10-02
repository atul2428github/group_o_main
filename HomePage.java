package com.admin.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HomePage {
	public void getHomePage() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs= null; 
		try {
			// Step 1: Load the Class Driver
			Class.forName("com.mysql.jdbc.Driver");
			// Step 2: Establish the Connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "shubham@deman");
			//Step 3: Prepare the statement
			ps = con.prepareStatement("Select *from product ");
			// Step4: Execute the statement
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Mobile Category");
				System.out.println("");
				System.out.println("id>>               "+rs.getInt(1));
				System.out.println("mobile name>>      "+rs.getString(2));
				System.out.println("Discption>>        "+rs.getString(3));
				System.out.println("Price>>            "+rs.getInt(4));
				System.out.println("Stock available>>  "+rs.getInt(5));
				System.out.println("");
				System.out.println("");
			}
		
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			ps.close();
			con.close();
			rs.close();
		}
		
		
	}	
/*	
public static void main (String []args) throws SQLException {
	HomePage hp=new HomePage();
	hp.getHomePage();
	AddToCart atc= new AddToCart();
	atc.getcartMethod();
	}
*/
}
