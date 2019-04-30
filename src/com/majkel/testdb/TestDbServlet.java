package com.majkel.testdb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*
;/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user="hbstudent";
		String pass="hbstudent";
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String driver="com.mysql.cj.jdbc.Driver";
	
		try {
			System.out.println("conn to database");
			
			Class.forName(driver);
			
			Connection connection = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("conn dziala");
			connection.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
	
	}

}
