package com.rivet.SpringStudentMgt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("/com/config/config.xml");
        Student bean = ac.getBean("stu",Student.class);
        System.out.println(bean);
        
        Student bean2 = ac.getBean("stu1",Student.class);
        System.out.println(bean2);
        //StuAddress bean2=(StuAddress)ac.getBean("stuadd");
//        System.out.println(bean.getId());
//        System.out.println(bean.getName());
//        System.out.println(bean.getAddress());
//        Student bean3=ac.getBean("stu1",Student.class);
//        System.out.println(bean3.getId());
//        System.out.println(bean3.getName());
//        System.out.println(bean3.getAddress());
        
    }
}
