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

public class DeleteServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Into DeleteServlet Service");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_class", "root",
					"Vaibhav#0079");
			String id=req.getParameter("id");
			//int id1=Integer.parseInt(id);
			PreparedStatement stmt = connection.prepareStatement("delete from data where id= ?");
			stmt.setString(1, id);
			int s=stmt.executeUpdate();
			if(s>0)
			{
				System.out.println("Deleted Successfully");
				RequestDispatcher rq=req.getRequestDispatcher("/display");
				rq.forward(req, res);
			}
			
		
	}catch (Exception e) {
		System.out.println(e);
	}
	}
}
