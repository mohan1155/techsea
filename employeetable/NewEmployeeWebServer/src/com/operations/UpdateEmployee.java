package com.operations;

	import org.hibernate.Session;
	import com.support.Emp;
	import com.support.SessionClass;

	public class UpdateEmployee {

		public static String updateEmp(Emp emp){
			String flag="failure";
			Session session = SessionClass.getSession();
			session.beginTransaction();
	        session.getNamedQuery("updateemp").
	        setString("empno", emp.getEno()).
	        setString("empname", emp.getEname()).
	        setString("empskill", emp.getEskill()).
	        setString("empprodesc", emp.getEpdesc()).
	        setString("hiredate", emp.getHiredate()).
	        setString("managername", emp.getMname()).
	        setString("deptno", emp.getDno()).
	        setString("userid", emp.getUid()).
	        setString("pswd", emp.getPswd()).
	        setString("lastmodifieduserid", emp.getLmuid()).executeUpdate();
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



