package com.admin.test;

import java.sql.ResultSet;
import java.util.Scanner;

public class UserLogin {
	//public static void main(String[] args) {
	public void getUserLogin() {
		UserLoginMethod ulm = new UserLoginMethod();
		Scanner sc = new Scanner(System.in);

		try {
			ResultSet rs = ulm.getUserloginMethod();
			if (rs.next()) {
				System.out.println("Password Correct...");
				ProductAdd pa= new ProductAdd();
				AddToCart atc=new AddToCart();
				//atc.getcartMethod();
				HomePage hp=new HomePage();
				hp.getHomePage();
			}

			else {
				System.out.println(" Login Failed!!");
				System.out.println("Try again");
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
