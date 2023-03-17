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
		openSession.save(s);
		transaction.commit();
		openSession.close();
	}

	public static List<Student> getAllUser() {
		List<Student> l1 = new ArrayList<>();
		Session openSession = StudentDAO.sessionFactory().openSession();
		Transaction transaction = openSession.beginTransaction();
		l1 = openSession.createQuery("from Student").getResultList();
		transaction.commit();
		openSession.close();
		return l1;
	}
	
	public static Student getUserById(int id) {
		
		Student s=new Student();
		Session openSession = StudentDAO.sessionFactory().openSession();
		Transaction transaction = openSession.beginTransaction();
		Student s1=openSession.get(Student.class, id);
		transaction.commit();
		openSession.close();
		return s1;
	}
	public static void deleteUser(int id)
	{	Session openSession = StudentDAO.sessionFactory().openSession();
		Transaction transaction = openSession.beginTransaction();
		Student s = openSession.get(Student.class, id);
        if (s!= null) {
            openSession.delete(s);
            System.out.print("user is deleted");
            transaction.commit();
    		openSession.close();
	}
	}
	
	public static void updateUser(Student s)
	{
		Session openSession = StudentDAO.sessionFactory().openSession();
		Transaction transaction = openSession.beginTransaction();
		openSession.update(s);
		transaction.commit();
		openSession.close();
	}
	
}
