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
			       
		<div  class="form" >
    		<form id="add" action="insertEmp.jsp"> 			
				<input class="add" name="add" id="add" value="Add Department" type="submit"> 	 	 
			</form> 
			<form id="search" action="search.jsp"> 			
				<input class="search" name="search" id="search" value="Search Employee" type="submit"> 	 
			</form> 
		</div>      
</div>
<% session.setAttribute("username",session.getAttribute("username")); %>
</body>
</html>

