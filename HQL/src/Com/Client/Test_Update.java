package Com.Client;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import Com.Config.HibernateUtil;
import Com.model.Student;
import jakarta.persistence.criteria.Selection;

public class Test_Update 
{
	public static void main(String[] args)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		String hql="update Student set name=?1 where rollno=?2;";
		Query<Student> query=session.createQuery(hql);
		
		query.setParameter(1, "hk");
		query.setParameter(2, 2);
		Transaction tx=session.beginTransaction();
		query.executeUpdate();
		tx.commit();
		
		
		
				
		
	}

}
