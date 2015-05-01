package com.empClients;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.emp.EmployeeOperationsServiceStub;
import com.emp.EmployeeOperationsServiceStub.Emp;
import com.emp.EmployeeOperationsServiceStub.InsertEmpDetails;


public class InsertEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session = request.getSession(false);
		EmployeeOperationsServiceStub empInsertstub = new EmployeeOperationsServiceStub();
		Emp emp = new Emp();
		//dept.setDeptNo();
		//System.out.println(session.getAttribute("username"));
		emp.setEname(request.getParameter("Empname"));
		emp.setEskill(request.getParameter("Empskill"));
		emp.setEpdesc(request.getParameter("Empprodesc"));
		emp.setHiredate(request.getParameter("Hiredate"));
		emp.setMname(request.getParameter("ManagerName"));
		emp.setDno(request.getParameter("Deptno"));
		emp.setUid(request.getParameter("Userid"));
		emp.setPswd(request.getParameter("Pswd"));
		emp.setCuid(request.getParameter("cuid"));
		System.out.println(request.getParameter("Empname")+request.getParameter("Empname")+request.getParameter("Empprodesc"));
		//emp.setCuid((String)session.getAttribute("username"));
		//emp.setCuid("Cuid");
		System.out.println(request.getParameter("Deptno"));
		InsertEmpDetails insertEmp = new InsertEmpDetails();
		
		insertEmp.setEmp(emp);
		String flag = empInsertstub.insertEmpDetails(insertEmp).get_return();

		request.setAttribute("successFlag",flag);
		RequestDispatcher reqDis =  request.getRequestDispatcher("/insertReturnEmp.jsp");
		reqDis.forward(request, response);
	
	}

}
