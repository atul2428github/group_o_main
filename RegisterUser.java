package com.admin.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RegisterUser {
	//public  void main (String []args) throws SQLException {
	public void getUserRegistration() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		Scanner sc=new Scanner(System.in);
		try {
			// Step1: Load the driver class
			Class.forName("com.mysql.jdbc.Driver");
			//Step 2: Establish the connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "shubham@deman");
			// Step 3: Prepare the statement
			ps=con.prepareStatement("Insert into user (name ,userid, password)values(?,?,?);");
			// Step 4: Submit the statement
			System.out.println("Enter the user name");
			String name=sc.next();
			ps.setString(1, name);
			System.out.println("Create User id");
			String id=sc.next();
			ps.setString(2, id);
			System.out.println("Create login password");
			String password=sc.next();
			ps.setString(3, password);
			// Step 5 Execute the statement
			int i=ps.executeUpdate();
			System.out.println("Successfully Created Account..."+i);
			System.out.println("Log in to jump homepage ");
			UserLogin ul=new UserLogin();
			ul.getUserLogin();
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}finally {
			sc.close();
			ps.close();
			con.close();
		}
		
	}
	

}
