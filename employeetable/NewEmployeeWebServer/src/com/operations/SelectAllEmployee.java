package com.operations;

	import java.util.ArrayList;
	import java.util.Iterator;

	import org.hibernate.Session;

	import com.support.Emp;
	import com.support.EmpArray;
	import com.support.SessionClass;

	public class SelectAllEmployee {
		
		public static Object selectAllEmp(){
			
			Session session = SessionClass.getSession();
			session.beginTransaction();
			ArrayList list= (ArrayList) session.getNamedQuery("selectemp").list();
			Iterator it = list.iterator();
			System.out.println(list);
			
			Emp[] emp = new Emp[list.size()];
			int i=0;
	while(it.hasNext()){
				
				emp[i]=(Emp) it.next();
				System.out.println(emp[i].getCuid());
				
				i++;
			}
			EmpArray empArray = new EmpArray();
			empArray.setEmp(emp);
			
			return empArray;
			
		}

	}



