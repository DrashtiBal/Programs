package com.test1.MavenProject2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   
        Configuration cf=new Configuration();
        cf.configure("hibernate.cfg.xml");
        SessionFactory sf = cf.buildSessionFactory();
        Employee e=new Employee();
        //e.setId(1);
        e.setName("riya");
        e.setEmail("r@gmail.com");
        e.setPassword("546");
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(e);
        transaction.commit();
        session.close();
    }
}
