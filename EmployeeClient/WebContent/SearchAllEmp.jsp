<%@page import="javax.management.modelmbean.RequiredModelMBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<script type="text/javascript" src="jquery.js"></script>

<script type="text/javascript">


</script>

<script type="text/javascript">

$(document).ready(function(){
	
	$('#cancel').click(function(){
		window.location.replace("/NewEmployeeClient/SearchEmp.jsp");
		
	});
		
});

</script>
<body background="images/bgnoise_lg.png">



	<%@ page import="java.util.*" %>
	
<%@ page import="com.emp.EmployeeOperationsServiceStub.Emp"%>

<%
Emp[] emp =(Emp[]) request.getAttribute("empAll");
if(emp.length>0){
%>
<body bgcolor="33ff99">

 <form method="post" >
    <div align="center">
    <br><br><br><br>
        <table border="2" cellpadding="5" bordercolor="ff00ff">
        <input type="hidden" name="hid" id="hid" value="hidden1"/>
            <caption ><h1>List of Employee Records</h1></caption>
            <tr bgcolor="33ccff">
           
	           <th height="2px"></th>
              <!--   <th>DeptNo</th>   -->
                <th>EmployeeName</th>
                <th>EmployeeSkill</th>
                <th>EmployeeProjectDescription</th>
                <th>Hiredate</th>
                <th>ManagerName</th>
                <th>DeptNo</th>
                <th>UserId</th>
                <th>Password</th>
                <th>CreatedUserId</th>
                <th>CreatedDate</th>
                <th>LastModifiedUserId</th>
                <th>LastModifiedDate</th>
            <% 

	
	for(int i=0;i<emp.length;i++){
		//String id=s.getPid();
		//request.setAttribute("id",id);
		%>
		<tr bgcolor="ccff33">
                
	              <td><input type="checkbox" name="checkval" id="ck" value="<%=emp[i].getEno()%>" /></td>  
                <!--  <td><a href="SelectEmpServlet?id=<%=emp[i].getEno()%>&hidd=get"><%=emp[i].getEno() %>    -->
                    <td><a href="SearchEmpServlet?id=<%=emp[i].getEno()%>&hidd=get"><%= emp[i].getEname()%></td>
                    <td><%= emp[i].getEskill()%></td>
                    <td><%= emp[i].getEpdesc()%></td>
                    <td><%= emp[i].getHiredate()%></td>
                    <td><%= emp[i].getMname()%></td>
                    <td><%= emp[i].getDno()%></td>
                    <td><%= emp[i].getUid()%></td>
                    <td><%= emp[i].getPswd()%></td>
                    <td><%= emp[i].getCuid()%></td>
                    <td><%=emp[i].getCdate() %></td>
                   <td><%= emp[i].getLmuid()%></td>
                   <td><%= emp[i].getLmdate()%></td>
                    </a></td>
                </tr>
                <% 
	
}
            %>
            </div>
            </table>
            <div align="center">
            <br>
                <input type="submit" class="styled-button" value="Delete" onClick="autoRefresh()">&nbsp&nbsp&nbsp&nbsp&nbsp
         
    <input type="button" value="Cancel" id="cancel">
            </div>
            </form>
            </body>
          
         
         <% session.setAttribute("username",session.getAttribute("username")); %>
         
            <%
            
            if(request.getParameter("hid")!=null){
            
            %>
         <!-- 
           	<script type="text/javascript">
			$(document).ready(function(){
				
				if($('#hid').val()=="hidden1"){
					$('#hid').val(null);
					//window.location.replace("/DeptClient/SelectAllDeptServlet");
					
				}
					
			});

            </script>
               -->
       <jsp:include page="/DeleteEmpServlet"></jsp:include>
       <!-- 
            <script type="text/javascript">
		$(document).ready(function(){
				
				if($('#hid').val()=="hidden1"){
					//alert("hai");
					//window.location.replace("http://www.google.com");
					
					window.location.replace("/DeptClient/SelectAllDeptServlet");
					
				}
			
             			
			});
		</script>
		 -->
		<script type="text/javascript">


$(document).ready(function(){
	
	$('#cancel').click(function(){
		window.location.replace("/NewEmployeeClient/AddOrSearchEmp.jsp");
		
	});
		
});

</script>
          
            <%
            
            
            }
           

}
else{
%>
<br>
<br>
<center><h1> NO RECORDS WERE FOUND </h1></center>

<%} %>





</body>
</html>
