package com.operations;


	import java.util.ArrayList;

	import org.hibernate.Session;

	import com.support.Emp;
	import com.support.SessionClass;

	public class SelectEmployee {

		public static Object selectEmp(Emp emp){
			
			Session session = SessionClass.getSession();

			Object obj=null ;
			try{
	        ArrayList list = (ArrayList) session.getNamedQuery("empselectbyid").setString("eno", emp.getEno()).list();
			java.util.Iterator i = list.iterator();
			int sizeOfList = list.size();
			while(i.hasNext()){		
				emp = (Emp) i.next();	
			}
	       
			if(sizeOfList>0) 
				obj=emp;
			else 
				obj=new String("failure");

		}
		catch(Exception e){
			e.printStackTrace();
			obj=new String("failure");
		}
		return obj;
	}	
}



