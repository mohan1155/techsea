package com.operations;

	import org.hibernate.Session;

	import com.support.Emp;
	import com.support.SessionClass;
	
	public class DeleteEmployee {
		public static String deleteEmp(Emp emp){
			String flag="failure";
			Session session = SessionClass.getSession();
			session.beginTransaction();
	        session.getNamedQuery("deleteemp").
	        setString("empno", emp.getEno()).executeUpdate();
			try{
			session.getTransaction().commit();
			flag="success";
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return flag;
		}
	}



