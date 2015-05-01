<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*" %>
<% 
Connection con=null;
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.12:1521:oradream","dream_erp","Dream123");
CallableStatement cs = null;

String eno=request.getParameter("Emp_no");
String ename=request.getParameter("Emp_name");
String eskill=request.getParameter("Emp_skill");
String epdesc=request.getParameter("Emp_project_desc"); 
String hiredate=request.getParameter("Hire_date");
String dno=request.getParameter("Deptno");
String mname=request.getParameter("Manager_name");

try{
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("Jdbc:Oracle:thin:@192.168.1.12:1521:oradream","dream_erp","Dream123");

	
	cs=con.prepareCall("{call updateEmp(?,?,?,?,?,?,?)}");
	cs.setString(1,eno);
  

    cs.setString(2,ename);
	cs.setString(3,eskill);
	cs.setString(4,epdesc);
	cs.setString(5,hiredate);
	cs.setString(6,dno);
	cs.setString(7,mname);

	cs.executeUpdate();
	//ResultSet no=cs.executeQuery();
	System.out.println("Record successfully updated");
}
catch(Exception e){
	e.printStackTrace();
}
%>


</body>
</html>