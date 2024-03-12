package com.registrationStudentSystem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Update2Servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_class", "root",
					"Vaibhav#0079");
			String id1=req.getParameter("id");
			String name=req.getParameter("fname");
			String sname=req.getParameter("lname");
			String Address=req.getParameter("address");
			String email=req.getParameter("email");

			PreparedStatement stmt = connection.prepareStatement("update data set fname='"+name+"'"
					+ ",lname='"+sname+"',address='"+Address+"',email='"+email+"' where id='"+id1+"'");
			int s=stmt.executeUpdate();
			if(s>0)
			{
				System.out.println("Updated Successfully");
				RequestDispatcher rq=req.getRequestDispatcher("/display");
				rq.forward(req, res);
			}
			
		}catch (Exception e) {
                  System.out.println(e);		
                  
		}
		}
}
