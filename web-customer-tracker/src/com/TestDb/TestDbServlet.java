package com.TestDb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.sql.*;
/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// Set connection variable
		
		String username="springstudent";
		String password="springstudent";
		String url="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		
		// get connection to database
		try 
		{
			PrintWriter out = response.getWriter();
			out.println("connecting to database "+url);
			
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, username, password);
			
			out.println("connected successsfully");
			
			conn.close();
			
		} 
		catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
			
		
	}

}
