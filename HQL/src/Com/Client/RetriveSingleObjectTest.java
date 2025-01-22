package Com.Client;

import org.hibernate.Session;
import org.hibernate.query.Query;

import Com.Config.HibernateUtil;
import Com.model.Student;

public class RetriveSingleObjectTest 
{
	public static void main(String[] args)
	{
		 Session Session=HibernateUtil.getSessionFactory().openSession();
		 
		 String hql="from Student where rollno=:id";
		         Query<Student> query=Session.createQuery(hql);
		                        query.setParameter("id", 2);
		                        Student s=query.getSingleResult();
		                        System.out.println(s.getRollno());
		                        System.out.println(s.getName());
		                        
		                        
		                        
		                        		
		                        		
		   
		 
	}

}
