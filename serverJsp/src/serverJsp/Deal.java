package serverJsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;


	/**
	 /* Servlet implementation class ProductServlet
	 */
	//@WebServlet("/ProductServlet")
public class Deal extends HttpServlet
{
	       
	Connection con=null;
	CallableStatement cs=null;
	Statement stmt=null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
			
		String pid=request.getParameter("deal-id");
		System.out.println(pid);
		
			try{
				int count=0;
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.12:1521:oradream","dream_erp","Dream123");
				stmt=con.createStatement();
				
				cs=con.prepareCall("{call DealDelete(?)}");
				cs.setString(1, pid);
				cs.execute();
				out.print("<center>");
				out.print("<h1>");
				out.print("Record Sucessfully deleted");
				out.print("<br>");		
				}
			
			
			
			catch(Exception e)
			{
			e.printStackTrace();
			}
		}
}

