package com.techsea;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	/**
	 * Servlet implementation class ProductServlet
	 */
	//@WebServlet("/ProductServlet")
public class insert extends HttpServlet {

	    Connection con=null;
		CallableStatement cs=null;
		String hdate;
		
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
	
			PrintWriter pw=response.getWriter();
			response.setContentType("text/html");
			
	        String eno=request.getParameter("Emp_no");
			String ename=request.getParameter("Emp_name");
			String eskill=request.getParameter("Emp_skill");
			String epdesc=request.getParameter("Emp_project_desc");
			String hiredate[]=request.getParameterValues("Hire_date");
	        String dno=request.getParameter("Deptno");
	        String mname=request.getParameter("Manager_name");
	        System.out.println(eskill);
	        for(int i=0;i<hiredate.length;i++){
	        	System.out.println(hiredate[i]);
	        }
			//System.out.println("values is : "+pname+id+pdetails+pid+sellerid);
	        hdate=hiredate[0]+"/"+hiredate[1]+"/"+hiredate[2];
			try{
				System.out.println(hdate);
				System.out.println(epdesc);
				System.out.println("front driver ");
				
				/*Throwable t=(Throwable)request.getAttribute("javax.servlet.error.exception");
				String name=(String)request.getAttribute("javax.servlet.error.servlet_name");
				int code=(Integer.parseInt((String) request.getAttribute("javax.servlet.error.status_code")));
				
				if(code!=500){
					pw.println("Error Details");
					pw.println("statuscode"+code);
					pw.println("<b></b>");
				}else {
					pw.println("Error Details");
					pw.println("Exception Name"+t.getClass().getName());
				}
				pw.println("<a href=\"insert.html\">Home Page</a>");*/
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//System.out.println("driver");
				//con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");
				Connection con=DriverManager.getConnection("Jdbc:Oracle:thin:@192.168.1.12:1521:oradream","dream_erp","Dream123");
				System.out.println("driver");
				
				
				/*Statement stmt = con.createStatement();
				ResultSet res = stmt.executeQuery("select name from dummy");
				while(res.next()){
					
					res.getString(1);
					
				}*/
				//System.out.println("driver con "+con);
				cs=con.prepareCall("{call insertEmp(?,?,?,?,?,?,?)}");
				cs.setString(1,eno);
				cs.setString(2, ename);
				cs.setString(3, eskill);
				cs.setString(4, epdesc);
				cs.setString(5, hdate);
				cs.setString(6, dno);
				cs.setString(7, mname);

				
				//cs.registerOutParameter(6,Types.VARCHAR);
				cs.executeUpdate();
				
				//String result=cs.getString(5);
				
				pw.println(" record saved successfully");
			
			}catch(Exception e){
			e.printStackTrace();
			}finally{
	            try {
	            	if(cs!=null)
	            	{
	            		cs.close();
	            	}
	                
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	            try {
	            	if(con!=null)
	            	{
	            		con.close();
	            	}
	                
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
			
			
		}

	/*	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			
		}*/

	}




