package Com.Client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.annotations.processing.HQL;
import org.hibernate.query.Query;

import Com.Config.HibernateUtil;
import Com.model.Student;


public class Test 
{
	public static void main(String[] args)
	{
		Session Session=HibernateUtil.getSessionFactory().openSession();
		        //fetch ALLData
		String hql="from Student";
		Query<Student> query=Session.createQuery(hql,Student.class);
		
		
		List<Student>  list               =query.getResultList();
		for(Student s:list)
		{
			System.out.println(s.getRollno());
			System.out.println(s.getName());
			
			
			
		}
			
		}
		
	

}
