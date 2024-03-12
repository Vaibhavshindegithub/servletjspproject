package com.registrationStudentSystem;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServletVeb extends HttpServlet{
	
	public LoginServletVeb() {
	System.out.println("Into LoginServletVeb Constructor");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Into LoginServletVeb service()");
		
		 PrintWriter out=res.getWriter();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_class","root", "Vaibhav#0079");
				//out.print("Connection Succesfull");
				
				String uname=req.getParameter("uname");
				String pass=req.getParameter("pass");
				PreparedStatement stmt=connection.prepareStatement("select * from validate_user where uname=? And password=?");
				stmt.setString(1, uname);
				stmt.setString(2, pass);
				ResultSet rs=stmt.executeQuery();
				
				if(rs.next())
				{
					System.out.println("Validate");
					req.setAttribute("Name", uname);
					RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
					rd.forward(req, res);
					
					out.print("Welcome");
				}
				else
				{
					System.out.println("Not Validate");
					out.print("Not Welcome");
					req.setAttribute("Name", uname);
					RequestDispatcher rd=req.getRequestDispatcher("error.jsp");
					rd.forward(req, res);
					
				}
			} catch ( Exception e) {
				
				e.printStackTrace();
			}
	
			
	}
}
