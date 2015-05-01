package com.operations;

	import org.hibernate.Session;

	import com.support.Emp;
	import com.support.SessionClass;

	public class InsertEmployee {
		
		public static String insertEmp(Emp emp){
			String flag="failure";
			Session session = SessionClass.getSession();
			session.beginTransaction();
			System.out.println(emp.getDno());
	        session.getNamedQuery("insertemp").
	        
	        setString("empname", emp.getEname()).
	        setString("empskill", emp.getEskill()).
	        setString("empprodesc", emp.getEpdesc()).
	        setString("hiredate", emp.getHiredate()).
	        setString("managername", emp.getMname()).
	        setString("deptno", emp.getDno()).
	        setString("userid", emp.getUid()).
	        setString("pswd", emp.getPswd()).
	        setString("createduserid", emp.getCuid()).executeUpdate();
			try{
			session.getTransaction().commit();
			flag="success";
			System.out.println("record inserted sucessfully");
			}
			catch(Exception e){
				System.out.println("record inserted failure");
				e.printStackTrace();
			}
			return flag;
		}

	}


