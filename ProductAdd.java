package com.admin.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProductAdd {
	
	public void addproduct() {
		
		try {
			Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "shubham@deman");
			PreparedStatement ps = con.prepareStatement("Insert into product (name, disc, price, quantity)values (?,?,?,?)");
			System.out.println("Enter name of mobile");
			String name=sc.next();
			System.out.println("Enter discription of mobile");
			String disc=sc.next();
			System.out.println("Set mobile price");
			int price=sc.nextInt();
			System.out.println("Enter the stock");
			int quant=sc.nextInt();
			ps.setString(1, name);
			ps.setString(2, disc);
			ps.setInt(3, price);
			ps.setInt(4, quant);
			int i=ps.executeUpdate();
			System.out.println("Successfully Inserted..."+i);
			sc.close();
			
		} catch (Exception e) {
			System.out.println(e);
			//e.printStackTrace();
		}
		
	}

	public static void main (String []args) {
		LoginAdmin la=new LoginAdmin();
		la.getAdminloginMethod();
		
		/*
		ProductAdd pa= new ProductAdd();
		pa.addproduct();
		*/
	}
}
