package com.student.drashti;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDAO {

	public static SessionFactory sessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory session = cfg.buildSessionFactory();
		return session;
	}

	public static void saveUser(Student s) {
		
		Session openSession = StudentDAO.sessionFactory().openSession();
		Transaction transaction = openSession.beginTransaction();
		try {
		openSession.save(s);
		transaction.commit();
		openSession.close();
		}
		catch(Exception e)
		{	
			if(transaction!=null)
			{
				System.out.println("can not enter duplicate value");
				transaction.rollback();
			}
		}
	}

	public static List<Student> getAllUser() {
		
		List<Student> l1 = new ArrayList<>();
		Session openSession = StudentDAO.sessionFactory().openSession();
		Transaction transaction = openSession.beginTransaction();
		try {
		l1 = openSession.createQuery("from Student").getResultList();
		transaction.commit();
		openSession.close();
		return l1;
		}
		catch(Exception e1)
		{
			if(transaction!=null)
			{
				System.out.println("No Data Found");
				transaction.rollback();
				
			}
		}
		return null;
	}
	
	public static Student getUserById(int id) {
		
		Student s=new Student();
		Session openSession = StudentDAO.sessionFactory().openSession();
		Transaction transaction = openSession.beginTransaction();
		try
		{
		Student s1=openSession.get(Student.class, id);
		transaction.commit();
		openSession.close();
		return s1;
	}
		catch(Exception e1)
		{
			if(transaction!=null)
			{
				System.out.println("No Data Found");
				transaction.rollback();
			}
		}return null;
	}
	public static void deleteUser(int id)
	{	Session openSession = StudentDAO.sessionFactory().openSession();
		Transaction transaction = openSession.beginTransaction();
		try {
		Student s = openSession.get(Student.class, id);
        if (s!= null) {
            openSession.delete(s);
            System.out.print("Student detail is Deleted");
            transaction.commit();
    		openSession.close();
        }
	}	catch(Exception e2)
		{
		if(transaction!=null)
		{
			System.out.println("Student Details not Deleted");
			transaction.rollback();
		}
		}
	}
	
	public static void updateUser(Student s)
	{
		Session openSession = StudentDAO.sessionFactory().openSession();
		Transaction transaction = openSession.beginTransaction();
		try {
		openSession.update(s);
		transaction.commit();
		openSession.close();
		}
		catch(Exception e3)
		{
				if(transaction!=null)
				{
					System.out.println("User Not Updated");
					transaction.rollback();
			}
		}
	}
}
