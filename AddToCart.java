package com.admin.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class AddToCart {
	int price;
	// int quant;
	String name;
	int total;

	public void getcartMethod() throws SQLException {

		ArrayList Quantity = new ArrayList<>();
		HashMap<Integer, Integer> mobile = new HashMap<Integer, Integer>();
		// HashMap<String, HashMap<Integer,Integer>>mobile =new HashMap<String,
		// HashMap<Integer,Integer>>();

		int quant = 0;

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// Step 1: Load the Class Driver
			Class.forName("com.mysql.jdbc.Driver");
			// Step 2: Establish the Connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "shubham@deman");
			// Step 3: Prepare the statement
			ps = con.prepareStatement("Select *from product ");
			// Step4: Execute the statement

			Scanner sc = new Scanner(System.in);
			System.out.println("how many models would you like to buy?");
			int no = sc.nextInt();

			for (int i = 1; i <= no; i++) {
				rs = ps.executeQuery();
				System.out.println(" ");
				System.out.println("Which Mobile you want to buy.");
				System.out.println("Please Select the id of mobile");
				int a = sc.nextInt();

				while (rs.next()) {

					if (a == rs.getInt(1)) {
						
						name = rs.getString(2) + "#" + rs.getInt(4);
						System.out.println("You have Choosen model : " + rs.getString(2));
						System.out.println("Discption is : " + rs.getString(3));
						price = rs.getInt(4);
						System.out.println("Price is : " + price);
						System.out.println("how many model do want to buy:");
						quant = sc.nextInt();
						total = total + price * quant;

					}
				}
				Quantity.add(name);
				mobile.put(price, quant);
				// mobile.put(name, Price);

			}
			Collections.sort(Quantity);
			System.out.println(Quantity);
			System.out.println("");
			System.out.println(mobile);
			System.out.println("");
			System.out.println("Total Amount to buy= " + total);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			ps.close();
			con.close();
			rs.close();
		}

	}

	public static void main(String[] args) throws SQLException {

		AddToCart atc = new AddToCart();
		HomePage hp=new HomePage();
		hp.getHomePage();
		atc.getcartMethod();

	}
	
}