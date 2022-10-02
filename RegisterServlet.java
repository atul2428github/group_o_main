package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			PrintWriter out = response.getWriter();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-coomerce", "root", "shubham@deman");
			PreparedStatement ps = con.prepareStatement("Insert Into userinformation (firstname, lastname, mobileNumber, userId,password) values (?,?,?,?,?)");
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			String mob=request.getParameter("mob");
			String userid=request.getParameter("userid");
			String password=request.getParameter("password");
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, mob);
			ps.setString(4, userid);
			ps.setString(5, password);
			
			ps.executeUpdate();
			//out.println("<font color=blue size=12> Successfully created account!!<br>");
			response.sendRedirect("successfullRegister.jsp");
			//response.sendRedirect("Login.jsp");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
