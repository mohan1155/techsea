<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   

<head>

<title>Employee Records</title>

<script>

function link()
{
	window.location="insert.jsp";
	}

</script>
</head>

<body bgcolor="lightgrey">

<style>
.heading{
background-color:990000

}

.butt {
  background-image: url ('/images/blue_button.jpg') no-repeat;
  cursor:pointer;
  }

h1 {
    color:blue;
    font-family:verdana;
    font-size:120%;

}
</style>
    <sql:setDataSource
        var="myDS"
        driver="oracle.jdbc.driver.OracleDriver"
        url="jdbc:oracle:thin:@192.168.1.12:1521:oradream"
        user="dream_erp" password="Dream123"
        />
    
    <sql:query var="listUsers" dataSource="${myDS}">
         select *from Employee 
    </sql:query>
     
    
    <form action="deleteAll.jsp" method="post">
    <div align="center">
    <table border="2" cellpadding="5" bordercolor="black">
        
<caption ><h1>List of employees </h1></caption>
            <tr bgcolor="yellow">
	            <th></th>
                <th>Emp_no</th>
                <th>Emp_name</th>
                <th>Emp_skill</th>
                <th>Emp_project_desc </th>
                <th>Hire_date</th>
                <th>Deptno</th>
                <th>Manager_name</th>
            </tr>
             
              <% int i=1;%>
            <c:forEach var="user" items="${listUsers.rows}">
             <% if(i%2==0){%>
                <tr bgcolor="white">
                
<td><input type="checkbox" name="checkval" value="${user.Emp_no}" /></td>  
               <td><c:out value="${user.Emp_no}" /></td>
               <td><c:out value="${user.Emp_name}" /></td>
               <td><c:out value="${user.Emp_skill}" /></td>
               <td><c:out value="${user.Emp_project_desc}" /></td>
               <td><c:out value="${user.Hire_date}" /></td>
               <td><c:out value="${user.Deptno}" /></td>
               <td><c:out value="${user.Manager_name}" /></td>
                      
                     </tr>
                <%} 
             
             else{%>
            	 <tr bgcolor="white">
                 
<td><input type="checkbox" name="checkval" value="${user.Emp_no}" /></td>  
                   <td><c:out value="${user.Emp_no}" /></td>
                   <td><c:out value="${user.Emp_name}" /></td>
                   <td><c:out value="${user.Emp_skill}" /></td>
                   <td><c:out value="${user.Emp_project_desc}" /></td>
                   <td><c:out value="${user.Hire_date}" /></td>
                   <td><c:out value="${user.Deptno}" /></td>
                   <td><c:out value="${user.Manager_name}" /></td>
                   
                </tr>
                <%}
             i++;
             %>
                
            </c:forEach>
         
 	 </table>
            </div>
            <br>
            <div align="center">
                <input type="submit" style="background-image: url('/images/images.jpg');" value="Delete">&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="button" value="GO HOME" onclick="link()">
            </div>
        </form>
   <script type="text/javascript">
 
   
</script> 

</body>
</html>