<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="wheat">
<center>
<form action="insert.jsp" method="post">

<h1 style="color:red"><br><br>Enter Employee details</h1>
<br><br><br><br>

<table>
<tr>
<td style="font-size:25px;color:blue">
Emp_no</td>
<td><input type="text" name="Emp_no" value="<%= request.getAttribute("eno")%>">
</td>
</tr>

<tr>
<td style="font-size:25px;color:blue">
Emp_name</td>
<td><input type="text" name="Emp_name" value="<%= request.getAttribute("ename")%>">
</td>
</tr>

<tr>
<td style="font-size:25px;color:blue">
Emp_skill</td>
<td><input type="text" name="Emp_skill" value="<%= request.getAttribute("eskill")%>">
</td>
</tr>


<tr>
<td style="font-size:25px;color:blue">
Emp_project_desc</td>
<td><input type="text" name="Emp_project_desc" value="<%= request.getAttribute("epdesc")%>">
</td>
</tr>



<tr>
<td style="font-size:25px;color:blue">
Hire_date</td>
<td><input type="text" name="Hire_date" value="<%= request.getAttribute("hiredate")%>">
</td>
</tr>


<tr>
<td style="font-size:25px;color:blue">
Deptno</td>
<td><input type="text" name="Deptno" value="<%= request.getAttribute("dno")%>">
</td>
</tr>


<tr>
<td style="font-size:25px;color:blue">
Manager_name</td>
<td><input type="text" name="Manager_name" value="<%= request.getAttribute("mname")%>">
</td>
</tr>


<tr>
<td>
<br><br>
<input type="submit" value="GO HOME">
</td>
</tr>

</table>
</center>
</body>
</form>
</html>