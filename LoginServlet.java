package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out = response.getWriter();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-coomerce", "root", "shubham@deman");
			String n = request.getParameter("userid");
			String p = request.getParameter("password");
			
			PreparedStatement ps = con.prepareStatement("Select userId from userinformation where userId=? and password=?");
			ps.setString(1, n);
			ps.setString(2, p);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				response.sendRedirect("Welcome.jsp");
				/*
				RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
				rd.forward(request, response);
				*/
		
		}
			/*if (n.equals("shubham") && p.equals("123456")) {
					response.sendRedirect("Welcome.jsp");
				}*/
	
		else {
				out.println("<font color=red size=18> Login Failed!!<br>");
				out.println("<a href=Login.jsp>Try Again..</a>");
			}
		}catch(

	ClassNotFoundException e)
	{

		e.printStackTrace();
	}catch(
	SQLException e)
	{

		e.printStackTrace();
	}

	// response.getWriter().append("Served at: ").append(request.getContextPath());
}

/*
 * protected void doPost(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException {
 * 
 * 
 * 
 * doGet(request, response);
 * 
 * }
 */

}
