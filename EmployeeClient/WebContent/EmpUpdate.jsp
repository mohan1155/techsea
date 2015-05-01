
<%@ page import="java.util.List" %>
<%@ page import="com.emp.EmployeeOperationsServiceStub.Emp" %>
<!DOCTYPE html>
<html>
<head>
<title>EMP</title>
	<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7; IE=EmulateIE9">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
    <link rel="stylesheet" type="text/css" href="style.css" media="all" />
    <link rel="stylesheet" type="text/css" href="demo.css" media="all" />
</head>
<body>
<div class="container">
	<!--/ freshdesignweb top bar -->
			<header>
				<h1> Update Employee Details Here</h1>
            </header>       
            
            <% session.setAttribute("username",session.getAttribute("username")); %>
            <%
            Emp emp = (Emp)request.getAttribute("empObj");
            session.setAttribute("emp", emp);
            %>
      <div  class="form" >
    		<form id="contactform" action="UpdateEmpServlet"> 
    				<p class="contact"><label for="name">Employee Name</label></p> 
    			<input id="name" name="Emp name" placeholder="Enter Employee Name" required="" type="text" value="<%=emp.getEname() %>"> 
    			
    			
    			<p class="contact"><label for="name">Employee Skill</label></p> 
    			<input id="name" name="Emp skill" placeholder="Enter Employee Skill" required="" type="text" value="<%=emp.getEskill() %>"> 
                
                
                
                <p class="contact"><label for="name">Employee Projectdescription</label></p> 
    			<input id="name" name="Empprodesc" placeholder="Enter Employee Projectdescription" required="" type="text" value="<%=emp.getEpdesc() %>"> 
                
                
                
                <p class="contact"><label for="name">Hiredate</label></p> 
    			<input id="date" name="Hiredate" placeholder="Enter Hiredate" required="" type="text" value="<%=emp.getHiredate() %>"> 
                
                
                
                <p class="contact"><label for="name">Manager Name</label></p> 
    			<input id="name" name="Managername" placeholder="Enter Manager Name" required="" type="text" value="<%=emp.getMname() %>"> 
    			
    			
    			<p class="contact"><label for="name">Department Number</label></p> 
    			<input id="name" name="Deptno" placeholder="Enter Department Number" required="" type="text" value="<%=emp.getDno() %>"> 
                
                
                
                <p class="contact"><label for="name">UserId</label></p> 
    			<input id="name" name="Userid" placeholder="Enter UserId" required="" type="text" value="<%=emp.getUid() %>"> 
                
                
                
		
            <p class="contact"><label for="name">Password</label></p> 
            <input id="name" name="Pswd" placeholder="Enter PasswordLocation" required="" type="text" value="<%=emp.getPswd() %>"> <br>
            
            
			 <p class="contact"><label for="name">Password</label></p> 
            <input id="name" name="username" placeholder="Enter userName" required="" type="text" value="<%=emp.getPswd() %>"> <br>
            
              
            <input class="buttom" name="submit" id="submit" tabindex="5" value="Submit" type="submit"> 	 
   </form> 
   
</div>

     <%
     /*
         dept.setDeptNo(request.getParameter("deptNo"));
          dept.setDeptNo(request.getParameter("deptName"));
          dept.setDeptNo(request.getParameter("location"));
           dept.setDeptNo(request.getParameter("username"));
           request.setAttribute("reqDeptObj", dept);
       */     
            %>      
</div>

</body>
</html>

