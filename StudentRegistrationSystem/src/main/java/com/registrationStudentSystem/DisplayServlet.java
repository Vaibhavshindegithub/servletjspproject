package com.registrationStudentSystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;

public class DisplayServlet extends HttpServlet{
	
	public DisplayServlet() {
		System.out.println("Into DisplayServlet Constructor");
}
		
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			System.out.println("Into DisplayServlet service()");
			ArrayList<StudPojo> dataList = new ArrayList<>();
			//StudPojo sp=new StudPojo();
			 PrintWriter out=res.getWriter();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_class","root", "Vaibhav#0079");
					Statement st=connection.createStatement();
					ResultSet rs=st.executeQuery("select * from data");
					
					 while (rs.next()) {
			                StudPojo sp = new StudPojo();
			                sp.setId(rs.getInt("id"));
			                sp.setFname(rs.getString("fname"));
			                sp.setSname(rs.getString("lname"));
			                sp.setAddress(rs.getString("address"));
			                sp.setEmail(rs.getString("email"));
			                
			                dataList.add(sp); // Add the object to the list
			            }
					 Iterator<StudPojo> itr = dataList.iterator();
					 while (itr.hasNext()) {
					     StudPojo student = itr.next();
					     System.out.println(student);
					     
					 }  
					 req.setAttribute("Data", dataList);
					 RequestDispatcher rs1=req.getRequestDispatcher("datasuccess.jsp");
					 rs1.forward(req, res);
				}catch (Exception e) {
					System.out.println(e);
				}
}
		}
