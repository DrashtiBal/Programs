package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

import com.test.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
       
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session session = factory.openSession();
        
        Student s=new Student(101,"jitendra");
        
        Transaction tx = session.beginTransaction();
        
        session.save(s);
     
        tx.commit();
        factory.close();
        
        
    }
    
    
    
}
