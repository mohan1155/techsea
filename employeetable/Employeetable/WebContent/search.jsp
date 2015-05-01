<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script> 
 
function link()
{
	alert("Succefully saved");
	}
 
</script>
 
 
<style> 
ul#menu {
    padding: 0;
}
 
ul#menu li {
    display: inline;
}
 
ul#menu li a {
    background-color: black;
    color: white;
    padding: 10px 10px;
    text-decoration: none;
    border-radius: 4px 4px 0 0;
}
 
ul#menu li a:hover {
    background-color: orange;
}
</style>
</head>
<body style="background-color:lightgrey">
 


<form action="search" method="post">
<body bgcolor="wheat">
<center>

<h1 style="color:red"><br><br>Enter Employee Details</h1>
<br><br><br><br>
<table>
<tr>
<td style="font-size:25px;color:blue">
Emp_no</td>
<td><input type="text" name="Emp_no">
</td>
</tr>

<!-- <tr>
<td style="font-size:25px;color:blue">
Prod_Catagory_name</td>
<td><input type="text" name="Prod_Catagory_name">
</td>
</tr>

<tr>
<td style="font-size:25px;color:blue">
Prd_Catagory_details</td>
<td><input type="text" name="Prod_Catagory_details">
</td>
</tr>


<tr>
<td style="font-size:25px;color:blue">
Product_ID</td>
<td><input type="text" name="Product_ID">
</td>
</tr>



<tr>
<td style="font-size:25px;color:blue">
Seller_ID</td>
<td><input type="text" name="Seller_ID">
</td>
</tr> --> 


<tr>
<td>
<br><br><br>




<!-- <ul id="menu" style="text-align:">
 <a href="insert.jsp">Edit</a>
 </ul> -->



<input type="submit" value="Select">


</td>
</tr>

</table>

</center>
</form>
</body>

</html>
