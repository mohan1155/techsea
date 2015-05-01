package com.techsea;
import java.io.IOException;
	import java.io.PrintWriter;
	import java.sql.CallableStatement;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.sql.Types;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	/**
	 /* Servlet implementation class ProductServlet
	 */
	//@WebServlet("/ProductServlet")
	public class search extends HttpServlet
	{
	       
		Connection con=null;
		CallableStatement cs=null;
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			// TODO Auto-generated method stub
			PrintWriter pw=response.getWriter();
			response.setContentType("text/html");
			
			String eno=request.getParameter("Emp_no");
			/*String ename=request.getParameter("Prod_Catagory_name");
			String pdetails=request.getParameter("Prod_Catagory_details");
		    String pid=request.getParameter("Product_ID"); 
			String sid=request.getParameter("Seller_ID");*/
		
			try
			{
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");
				Connection con=DriverManager.getConnection("Jdbc:Oracle:thin:@192.168.1.12:1521:oradream","dream_erp","Dream123");

				/*System.out.println("hi");
				Statement stmt = con.createStatement();
				
				ResultSet rs = stmt.executeQuery("select * from tab");
				while(rs.next()){
					System.out.println(rs.getString(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
				
				}*/
				cs=con.prepareCall("{call searchEmp(?,?,?,?,?,?,?)}");
				cs.setString(1,eno);
			    cs.registerOutParameter(2,Types.VARCHAR );
				cs.registerOutParameter(3,Types.VARCHAR );
				cs.registerOutParameter(4,Types.VARCHAR );
				cs.registerOutParameter(5,Types.VARCHAR );
				cs.registerOutParameter(6,Types.VARCHAR );
				cs.registerOutParameter(7,Types.VARCHAR );


		        /*cs.setString(2,pname);
				cs.setString(3,pdetails);
				cs.setString(4,pid);
				cs.setString(5,sid);*/

				
				
				ResultSet no=cs.executeQuery();
				
				System.out.println(no+" Record successfully selected");
				System.out.println(cs.getString(2));
				System.out.println(cs.getString(3));
				System.out.println(cs.getString(4));
				System.out.println(cs.getString(5));
				System.out.println(cs.getString(6));
				System.out.println(cs.getString(7));

				
				request.setAttribute("eno", eno);
				request.setAttribute("ename",cs.getString(2));
				request.setAttribute("eskill",cs.getString(3));
				request.setAttribute("epdesc",cs.getString(4));
				request.setAttribute("hiredate",cs.getString(5));
				request.setAttribute("dno",cs.getString(6));
				request.setAttribute("mname",cs.getString(7));

				String nextJSP = "/UpdateRec.jsp";
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
				dispatcher.include(request,response);
				
				
			}
			
			catch(Exception e)
			{
			e.printStackTrace();
			}
		}
	}




