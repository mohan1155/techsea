package com.techsea;

    import java.io.IOException;
	import java.io.PrintWriter;
	import java.sql.CallableStatement;
	import java.sql.Connection;
	import java.sql.DriverManager;

	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;


		/**
		 /* Servlet implementation class ProductServlet
		 */
		//@WebServlet("/ProductServlet")
	public class delete  extends HttpServlet
	{
		       
		Connection con=null;
		CallableStatement cs=null;
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			// TODO Auto-generated method stub
			PrintWriter pw=response.getWriter();
			response.setContentType("text/html");
				
			String eno=request.getParameter("Emp_no");
			System.out.println(eno);
			
				try{
					
					Class.forName("oracle.jdbc.driver.OracleDriver");
					//con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");
					Connection con=DriverManager.getConnection("Jdbc:Oracle:thin:@192.168.1.12:1521:oradream","dream_erp","Dream123");

					cs=con.prepareCall("{call deleteEmp(?)}");
				
					cs.setString(1,eno);
					
					int no=cs.executeUpdate();
					
					System.out.println(no+"Record successfully deleted");
				}
				
				catch(Exception e)
				{
				e.printStackTrace();
				}
			}
	}




