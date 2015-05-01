package com.empClients;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.emp.EmployeeOperationsServiceStub;
import com.emp.EmployeeOperationsServiceStub.Emp;
import com.emp.EmployeeOperationsServiceStub.SelectEmpDetails;

public class SearchEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		 session.setAttribute("username",session.getAttribute("username")); 
		 
		com.emp.EmployeeOperationsServiceStub empStub = new EmployeeOperationsServiceStub();
		SelectEmpDetails selectEmp = new SelectEmpDetails();
		Emp emp = new Emp();
		emp.setEno(request.getParameter("id"));
		selectEmp.setEmp(emp);
		Object obj = empStub.selectEmpDetails(selectEmp).get_return();
		
		if(obj instanceof String){
			System.out.println(obj);
		}
		else if(obj instanceof Emp){
			emp = (Emp)obj;
			
		}
		System.out.println(emp.getEno());
		System.out.println(emp.getEname());
		System.out.println(emp.getEskill());
		System.out.println(emp.getEpdesc());
		System.out.println(emp.getHiredate());
		System.out.println(emp.getMname());
		System.out.println(emp.getDno());
		System.out.println(emp.getUid());
		System.out.println(emp.getPswd());
		System.out.println(emp.getLmuid());
		
		request.setAttribute("empObj", emp);
		RequestDispatcher reqDis = request.getRequestDispatcher("/EmpUpdate.jsp");
		reqDis.forward(request, response);
	}

}
