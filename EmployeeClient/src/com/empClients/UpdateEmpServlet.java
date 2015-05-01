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
import com.emp.EmployeeOperationsServiceStub.UpdateEmpDetails;

/**
 * Servlet implementation class UpdateEmpServlet
 */
public class UpdateEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		
		HttpSession session = request.getSession(false);
		com.emp.EmployeeOperationsServiceStub empStub = new EmployeeOperationsServiceStub();
		Emp emp = new Emp();
		UpdateEmpDetails updateEmp=  new UpdateEmpDetails();
		Emp employee = (Emp) session.getAttribute("emp");
		
		emp.setEno(employee.getEno());
		emp.setEname(request.getParameter("Emp name"));
		emp.setEskill(request.getParameter("Emp skill"));
		emp.setEpdesc(request.getParameter("Empprodesc"));
		emp.setHiredate(request.getParameter("Hiredate"));
		emp.setMname(request.getParameter("Managername"));
		emp.setDno(request.getParameter("Deptno"));
		emp.setUid(request.getParameter("Userid"));
		emp.setPswd(request.getParameter("Pswd"));
		emp.setLmuid(request.getParameter("username"));
		
	    updateEmp.setEmp(emp);
	    
	
		String flag=empStub.updateEmpDetails(updateEmp).get_return();
		System.out.println(flag);
		
		if(flag.equals("success")){
			request.setAttribute("successFlag",flag);
			
			RequestDispatcher reqDis = 	request.getRequestDispatcher("EmpUpdateReturn.jsp");
			reqDis.forward(request,response);	}

}
}
