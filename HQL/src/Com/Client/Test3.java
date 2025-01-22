package Com.Client;

import org.hibernate.Session;

import Com.Config.HibernateUtil;
import Com.model.Student;

public class Test3 
{
	public static void main(String[] args)
	{

		Session session=HibernateUtil.getSessionFactory().openSession();
		
//		Student ss=new Student();
//		ss.setRollno(1);
//		ss.setName("XYZ");
//		
//		session.persist(ss);
//		session.beginTransaction().commit();
//		
//		System.out.println("data inserted");
		
			Student s1=session.get(Student.class,1);
			//Session1.evict(ob1);
			Student s2=session.get(Student.class,1);
			//Session1.clear();
		
		
			
		Session session1=HibernateUtil.getSessionFactory().openSession();
		
			Student s3=session1.get(Student.class,1);
			Student s4=session1.get(Student.class,1);
		
		}
}

	
	
		
		
	
	
		
		
		


		

	
			
		
	
				

