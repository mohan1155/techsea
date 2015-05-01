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
try{
	
Connection con=null;
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.12:1521:oradream","dream_erp","Dream123");
CallableStatement cs = null;

String ar[] = request.getParameterValues("checkval");
int count=0;
for(int i=0;i<ar.length;i++){
System.out.println(ar[i]);
String value= ar[i];
if(value!=null)
{
	cs=con.prepareCall("{call deleteEmp(?)}");
	cs.setString(1, value);
	cs.execute();
	count++;
}
}
%>
<center>
<h1>
<%="NO OF RECORDS ARE DELETED :  "+count %>
</center>
</h1>
<% 
}
catch(Exception e){
	e.printStackTrace();
%>
 <center><h1> NO RECORDS WERE SELECTED TO DELETE </h1></center>

<%}%>
</body>
<center>
<a href="RetrieveAll.jsp">Click Here to Get the Remaining Records</a>

</center></html>