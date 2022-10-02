package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/indexServlet")
public class indexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		out.print("<table><tr><th>name</th><th>Discrption</th><th>Price</th>");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "shubham@deman");
			PreparedStatement ps = con.prepareStatement("Select * from mobile;");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				out.print("<tr><td>");
				out.print(rs.getString(1));
				out.print("</td><td>");
				out.print(rs.getString(2));
				out.print("</td><td>");
				out.print(rs.getString(3));
				out.print("</td></tr>");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
