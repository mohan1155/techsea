
<!DOCTYPE html>
<html>
<head>
<script src="emp.js">


</script>


<style>

h1 {
    color:red;
    font-family:verdana;
    font-size:120%;

}
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
    background-color: blue;
}
</style>
</head>

<form action="insert" method="post">
<body style="background-color:white">
<h1 style="text-align:center">Employee Details</h1>

<ul id="menu" style="text-align:center">
  <li><a href="search.jsp">Search</a></li>
  <li><a href="delete.jsp">Delete</a></li>
  <li><a href="update.jsp">Update</a></li>
  <li><a href="RetrieveAll.jsp">All Records</a></li>
</ul>
  
<center>
<h1 style="color:red"><br><br>Enter Employee Details</h1>
<br>

<table>
<tr>
<td style="font-size:25px;color:blue">
Emp_no</td>
<td><input type="text" name="Emp_no" onfocusout="isNull(this)">
</td>
</tr>

<tr>
<td style="font-size:25px;color:blue">
Emp_name</td>
<td><input type="text" name="Emp_name">
</td>
</tr>

<!-- <tr>
<td style="font-size:25px;color:blue">
Emp_skill</td>
 <td><input type="text" name="Emp_skill">
</td> -->

<tr><td style="font-size:25px;color:blue">
Emp_skill</td>
<td>
<select  name="Emp_skill">
	<option value="-">-</option>
	<option value=".NET">.Net</option>
	<option value="Application Developer">Application Developer</option>
	<option value="Database Administrator">Database Administrator</option>
	<option value="Design Associate">Design Associate</option>
	<option value="Desktop Suport Technician">Desktop Support Technician</option>
	
</select>
</td></tr>

</tr>


<!--  <tr>
<td style="font-size:25px;color:blue">
Emp_project_desc</td>
<td><input type="text" name="Emp_project_desc">
</td>


</tr>-->

<tr><td style="font-size:25px;color:blue">
Emp_project_desc</td>
<td><textarea rows="5" cols="20" name="Emp_project_desc"></textarea></td></tr>
  



<!--  <tr>
<td style="font-size:25px;color:blue">
Hire_date</td>
<td><input type="text" name="Hire_date">
</td>
</tr>-->


<tr>
<td style="font-size:25px;color:blue">
Hire_date</td>
<td>
<select name="Hire_date">
	<option value="-">-</option>
	<option value="1">1</option>
	<option value="2">2</option>
	<option value="3">3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	<option value="6">6</option>
	<option value="7">7</option>
	<option value="8">8</option>
	<option value="9">9</option>
	<option value="10">10</option>
	<option value="11">11</option>
	<option value="12">12</option>
	<option value="13">13</option>
	<option value="14">14</option>
	<option value="15">15</option>
	<option value="16">16</option>
	<option value="17">17</option>
	<option value="18">18</option>
	<option value="19">19</option>
	<option value="20">20</option>
	<option value="21">21</option>
	<option value="22">22</option>
	<option value="23">23</option>
	<option value="24">24</option>
	<option value="25">25</option>
	<option value="26">26</option>
	<option value="27">27</option>
	<option value="28">28</option>
	<option value="29">29</option>
	<option value="30">30</option>
	<option value="31">31</option>
</select>

<select name="Hire_date">
	<option value="-" >-</option>
	<option value="1">Jan</option>
	<option value="2">Feb</option>
	<option value="3">Mar</option>
	<option value="4">Apr</option>
	<option value="5">May</option>
	<option value="6">June</option>
	<option value="7">July</option>
	<option value="8">Aug</option>
	<option value="9">Sept</option>
	<option value="10">Oct</option>
	<option value="11">Nov</option>
	<option value="12">Dec</option>
</select>

 <select name="Hire_date">
	<option value="-">-</option>
	<option value="2015">2015</option>
	<option value="2014">2014</option>
	<option value="2013">2013</option>
	<option value="2012">2012</option>
	<option value="2011">2011</option>
	<option value="2010">2010</option>
	<option value="2009">2009</option>
	<option value="2008">2008</option>
	<option value="2007">2007</option>
	<option value="2006">2006</option>
	<option value="2005">2005</option>
	<option value="2004">2004</option>
	<option value="2003">2003</option>
	<option value="2002">2002</option>
	<option value="2001">2001</option>
	<option value="2000">2000</option>
	<option value="1999">1999</option>
	<option value="1998">1998</option>
	<option value="1997">1997</option>
	<option value="1996">1996</option>
	<option value="1995">1995</option>
	<option value="1994">1994</option>
	<option value="1993">1993</option>
	<option value="1992">1992</option>
	<option value="1991">1991</option>
	<option value="1990">1990</option>
</select>
</td></tr>

<tr><td style="font-size:25px;color:blue">
Deptno</td>
<td><input type="text" name="Deptno"></td></tr>

<tr><td style="font-size:25px;color:blue">
Manager_name</td>
<td><input type="text" name="Manager_name"></td></tr>


<tr>
<td>
<br><br>
<input type="submit" value="Submit">
</td>
</tr>

</table>


<!--  <ul id="menu" style="text-align:">
 <li><a href="update.jsp">Update</a></li>
 <li><a href="delete.jsp">Delete</a></li>
 <li><a href="select.jsp">Search</a></li>
 </ul> -->
</center>
</body>
</form>
</html>