package com.emp;

import com.operations.DeleteEmployee;


import com.operations.InsertEmployee;
import com.operations.SelectAllEmployee;
import com.operations.SelectEmployee;
import com.operations.UpdateEmployee;
import com.support.Emp;
import com.support.EmpArray;

	public class EmployeeOperationsService {
		
		public String insertEmpDetails(Emp emp){
			String flag = InsertEmployee.insertEmp(emp);
			return flag ;
		}
		
		public String deleteEmpDetails(Emp emp){
			String flag = DeleteEmployee.deleteEmp(emp);
			return flag ;
		}	
		
		
		
		public String updateEmpDetails(Emp emp){
			String flag = UpdateEmployee.updateEmp(emp);
			return flag ;
		}
		
		public Object selectEmpDetails(Emp emp){
			Object flag = SelectEmployee.selectEmp(emp);
			return flag ;
		}
		
		
		
		public EmpArray selectAllEmpDetails(){
			EmpArray flag = (EmpArray)SelectAllEmployee.selectAllEmp();
			
			return flag ;
		}	
		public void Hello(){
			System.out.println("hello");
		}
		
	}




