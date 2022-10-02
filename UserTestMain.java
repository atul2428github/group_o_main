package com.admin.test;

import java.sql.SQLException;


public class UserTestMain {

	public static void main(String[] args) throws SQLException {
		
		RegisterUser registeruser=new RegisterUser();
		UserLogin userlogin =new UserLogin();
		AddToCart addtocart = new AddToCart();
		HomePage homepage =new HomePage();
		
		
		registeruser.getUserRegistration();
		userlogin.getUserLogin();
		homepage.getHomePage();
		addtocart.main(args);
	}
}
