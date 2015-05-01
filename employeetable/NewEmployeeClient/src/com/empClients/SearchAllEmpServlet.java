package com.empClients;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.EmployeeOperationsServiceStub;
import com.emp.EmployeeOperationsServiceStub.Emp;
import com.emp.EmployeeOperationsServiceStub.EmpArray;
import com.emp.EmployeeOperationsServiceStub.SelectAllEmpDetails;
import com.emp.EmployeeOperationsServiceStub.SelectEmpDetails;

/**
 * Servlet implementation class SearchAllEmpServlet
 */
public class SearchAllEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String flag="";
		try{	
		com.emp.EmployeeOperationsServiceStub empStub = new EmployeeOperationsServiceStub();
	
	String id = request.getParameter("id");
	Emp[] emp=new Emp[1];
	if(id==null){
	SelectAllEmpDetails selAllEmp = new SelectAllEmpDetails();
	EmpArray empArray=empStub.selectAllEmpDetails(selAllEmp).get_return();
	 emp =empArray.getEmp();
	flag="success";
	 System.out.println(emp.length);
	for(int i=0;i<emp.length;i++){
		Emp emp1 = emp[i];
		//System.out.println(dept1);
		
		//System.out.print(emp1.getEno()+"\t");
	/*	System.out.print(emp1.getEname()+"\t");
		System.out.print(emp1.getEskill()+"\t");
		System.out.print(emp1.getEpdesc()+"\t");
		System.out.print(emp1.getHiredate()+"\t");
		System.out.print(emp1.getMname()+"\t");
		System.out.print(emp1.getDno()+"\t");
		System.out.print(emp1.getUid()+"\t");
		System.out.print(emp1.getPswd()+"\t");
		System.out.print(emp1.getCuid()+"\t");
		System.out.print(emp1.getCdate()+"\t");
		System.out.print(emp1.getLmuid()+"\t");
		System.out.print(emp1.getLmdate()+"\n");*/
	
	
	}
	}
	else{
		SelectEmpDetails selectEmp = new SelectEmpDetails();
		Emp empObj = new Emp();
		empObj.setEname(id);
		selectEmp.setEmp(empObj);
		Object obj = empStub.selectEmpDetails(selectEmp).get_return();
		if(obj instanceof String){
			flag = (String) obj;
		}
		else if(obj instanceof Emp){
			emp[0] = (Emp)obj;
			
		}
		
	
	}
	if(!flag.equals("failure")){
	
	request.setAttribute("empAll", emp);
	RequestDispatcher reqDisp = request.getRequestDispatcher("SearchAllEmp.jsp");
	reqDisp.include(request, response);
	}
	else
	{
		
	 	out.print("<center style='color:red'>");
    	out.print("<h2>");
    	out.print("No Records were selected to delete");
    	out.print("</h2>");
    	out.print("</center>");
	}
	System.out.println("hai");
	}
		catch(Exception e){
			out.print("<center style='color:red'>");
	    	out.print("<h2>");
	    	out.print("No Record is found to Display");
	    	out.print("</h2>");
	    	out.print("</center>");
			
	}

}
}
