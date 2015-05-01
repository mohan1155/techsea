package com.empClients;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.EmployeeOperationsServiceStub;
import com.emp.EmployeeOperationsServiceStub.DeleteEmpDetails;
import com.emp.EmployeeOperationsServiceStub.Emp;

public class DeleteEmpServlet extends HttpServlet {

   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String ar[] = request.getParameterValues("checkval");
		int count=0;
		if(ar.length>0){
			for(int i=0;i<ar.length;i++){
				System.out.println(ar[i]);
				String value= ar[i];
		
				EmployeeOperationsServiceStub empDeletestub = new EmployeeOperationsServiceStub();
				Emp emp = new Emp();
				emp.setEno(value);

				DeleteEmpDetails deleteEmp = new DeleteEmpDetails();
		
				deleteEmp.setEmp(emp);
				empDeletestub.deleteEmpDetails(deleteEmp);
				count++;
			}
		}
		else{    	
            	out.print("<center style='color:red'>");
            	out.print("<h2>");
            	out.print("No Records were selected to delete");
            	out.print("</h2>");
            	out.print("</center>");
            	
            	
            }
		if(count>0){
			System.out.println(count);

			request.setAttribute("count", count);
			RequestDispatcher reqDispatcher = request.getRequestDispatcher("/EmpDeleteStatus.jsp");
			reqDispatcher.forward(request, response);
	
	}
	}

}
