package com.registrationStudentSystem;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetDataServlet extends HttpServlet {

	public SetDataServlet() {
		System.out.println("Into SetDataServlet Constructor");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Into LoginServletVeb service()");

		PrintWriter out = res.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_class", "root",
					"Vaibhav#0079");
			// out.print("Connection Succesfull");

			String fname = req.getParameter("fname");
			String lname = req.getParameter("lname");
			String address = req.getParameter("address");
			String email = req.getParameter("email");
			  PreparedStatement stmt = connection.prepareStatement("insert into data( fname, lname, address, email) values ( ?, ?, ?, ?)");

	           
	         
	                stmt.setString(1, fname);
	                stmt.setString(2, lname);
	                stmt.setString(3, address);
	                stmt.setString(4, email);
	                
	                
	                int a = stmt.executeUpdate();
	                if (a > 0) {
	                    req.setAttribute("d", a);
	                    System.out.println("Data Inserted Successfully");
	                    RequestDispatcher rd = req.getRequestDispatcher("datainsertes.jsp");
	                    rd.forward(req, res);
	                } else {
	                    System.out.println("Data Insertion failed");
	                    RequestDispatcher rd = req.getRequestDispatcher("error.jsp");
	                    rd.forward(req, res);
	                }
	            
	             stmt.close();
	            connection.close();
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
