package com.registrationStudentSystem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_class", "root",
					"Vaibhav#0079");
			String id1=req.getParameter("id");
			PreparedStatement stmt1 = connection.prepareStatement("select * from data where id='"+id1+"'");
			ArrayList<StudPojo> dataList = new ArrayList<>();
			ResultSet rs=stmt1.executeQuery();
			 while (rs.next()) {
	                StudPojo sp = new StudPojo();
	                sp.setId(rs.getInt("id"));
	                sp.setFname(rs.getString("fname"));
	                sp.setSname(rs.getString("lname"));
	                sp.setAddress(rs.getString("address"));
	                sp.setEmail(rs.getString("email"));
	                
	                dataList.add(sp); // Add the object to the list
	                req.setAttribute("fname", rs.getString("fname"));
	                req.setAttribute("sname", rs.getString("lname"));
	                req.setAttribute("address", rs.getString("address"));
	                req.setAttribute("email", rs.getString("email"));
	            }
			
			 req.setAttribute("Data", dataList);
			 req.setAttribute("id", id1);
			
			 RequestDispatcher rs1=req.getRequestDispatcher("update.jsp");
			 rs1.forward(req, res);
			
			

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
