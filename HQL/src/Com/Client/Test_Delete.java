package Com.Client;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import Com.Config.HibernateUtil;
import Com.model.Student;


public class Test_Delete 
	{
		public static void main(String[] args)
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			         
			String hql="delete from student where rollno=:id";
			Query<Student> query=session.createQuery(hql);
			
			query.setParameter("id",2);
			Transaction tx=session.beginTransaction();
			query.executeUpdate();
			tx.commit();
			
			
			
			
	
	}

}
