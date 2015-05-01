<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<!--/ freshdesignweb top bar -->
			<header>
				<h1> Enter Employee Details to Insert</h1>
            </header>       
      <div  class="form" >
    		<form id="contactform" action="InsertEmpServlet"> 
    		
    		<!-- 	<p class="contact"><label for="name">Employee Number</label></p> 
    			<input id="name" name="Emp no" placeholder="Enter Employee Number" required=""  type="text">  -->
    			 
    			<p class="contact"><label for="name">Employee Name</label></p> 
    			<input id="name" name="Empname" placeholder="Enter Employee Name" required="" type="text"> 
    			
    			
    			<p class="contact"><label for="name">Employee Skill</label></p> 
    			<input id="name" name="Empskill" placeholder="Enter Employee Skill" required="" type="text"> 
                
                
                
                <p class="contact"><label for="name">Employee Projectdescription</label></p> 
    			<input id="name" name="Empprodesc" placeholder="Enter Employee Projectdescription" required="" type="text"> 
                
                
                
                <p class="contact"><label for="name">Hiredate</label></p> 
    			<input id="date" name="Hiredate" placeholder="Enter Hiredate" required="" type="text"> 
                
                
                
                <p class="contact"><label for="name">Manager Name</label></p> 
    			<input id="name" name="ManagerName" placeholder="Enter Manager Name" required="" type="text"> 
    			
    			
    			<p class="contact"><label for="name">Department Number</label></p> 
    			<input id="name" name="Deptno" placeholder="Enter Department Number" required="" type="text"> 
                
                
                
                <p class="contact"><label for="name">UserId</label></p> 
    			<input id="name" name="Userid" placeholder="Enter UserId" required="" type="text"> 
                
                
                
		
            <p class="contact"><label for="name">Password</label></p> 
            <input id="name" name="Pswd" placeholder="Enter PasswordLocation" required="" type="text"> <br>
            
            <p class="contact"><label for="name">CreatedUserid</label></p> 
            <input id="name" name="cuid" placeholder="Enter CreatedUserid" required="" type="text"> <br>
            
            

              
            <input class="buttom" name="submit" id="submit" tabindex="5" value="Submit" type="submit"> 
            <input class="buttom" name="submit" id="cancel" value="Cancel" type="button">  	 	 
   </form> 
</div>  
    
<% session.setAttribute("username",session.getAttribute("username")); %>
<script type="text/javascript" src="jquery.js"></script>

<script type="text/javascript">


$(document).ready(function(){
	
	$('#cancel').click(function(){
		window.location.replace("/NewEmployeeClient/AddOrSearch.jsp");
		
	});
		
});

</script> 

<!-- 
<%
String obj =(String) request.getAttribute("successFlag");
if(obj!=null){
	if(obj.equals("success")){
%>
<center>
<h2 style="color: red;font: 50">Record Sucessfully Inserted</h2>
</center>
<%}}%>
 -->   
</div>
</body>
</html>

