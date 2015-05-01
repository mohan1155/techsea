function isNull(input){
alert("Do not leave the field as empty");
if(input.value==null || input.value==""){

	alert("Do not leave the field as empty");
}

}

function deptValidation(){
var dno=document.getElementById("Emp_no");
var eno=document.getElementById("Emp_name");
var eno=document.getElementById("Emp_skill");
var eno=document.getElementById("Emp_project_desc");
var eno=document.getElementById("Hire_date");
var eno=document.getElementById("Deptno");
var dname=document.getElementById("Manager_name");
var filter=/^([a-z A-Z])+$/;
var num=/^([0-9])+$/;if(Emp_no.value.length==="" || Emp_name.value.length== "" ||Emp_skill.value.length== "" || Emp_project_desc.value.length== "" || Hire_date.value.length==="" || Deptno.value.length==="" || Manager_name.value.length==="" ||){
		alert("Enter values");
	}
else
{ 
if(Emp_no.value.length == "" || filter.test(Emp_no.value)){	
		alert("Enter valid Employee Number");
		return false;
	}
if( Emp_name.value.length=== "" || num.test( Emp_name.value)){
		alert("Enter valid Employee Name");
return false;
	}

if(Emp_skill.value.length === "-"){
		alert("Enter valid Employee Skill");
return false;
	}
if(Emp_project_desc.value.length=== "" || num.test(Emp_project_desc.value)){
		alert("Enter valid Description");
return false;
	}
if(Hire_date.value.length=== "" ){
		alert("Enter valid Date");
return false;
	}
if(Deptno.value.length=== "" || filter.test(Deptno.value)){
		alert("Enter valid Deptno");
return false;
	}
if(Manager_name.value.length=== "" || num.test(Manager_name.value)){
		alert("Enter valid Managername");
return false;
	}

alert("Entered sucessfully");

}

}




