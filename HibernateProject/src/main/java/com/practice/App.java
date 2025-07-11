package com.practice;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practice.Utility.HibernateUtility;
import com.practice.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
//        		.buildSessionFactory();
        Student s = new Student();
        s.setId(9);
        s.setfName("aaa");
        s.setlName("bbb");
        s.setCource("Python");
        s.setCity("Korea");
        s.setMobileNumber(438232323);
        s.setGender("Female");
        
        Student s1 = new Student();
        s1.setId(6);
        s1.setfName("aaaa");
        s1.setlName("cccc");
        s1.setCource("C++");
        s1.setCity("Dubai");
        s1.setMobileNumber(423872938);
        s1.setGender("Female");
        
        Student s2 = new Student();
        s2.setId(7);
        s2.setfName("dddd");
        s2.setlName("aaaa");
        s2.setCource("OOP");
        s2.setCity("USA");
        s2.setMobileNumber(423897423);
        s2.setGender("Female");
        
        List<Student> studentlist = Arrays.asList(s,s1,s2);
        
        
        //1.Session Factory
        SessionFactory factory = HibernateUtility.getSessionFactory();
        
        //2. Session from Session Factory
        Session session =factory.openSession();
        
        //3.Transaction from session
//        Transaction transaction = session.beginTransaction();
        
        // To save sigle Data 
//        //4. save process
//        session.persist(s);
//        
//        //5. pass to database
//        transaction.commit();
//        
//        //6.close session
//        session.close();
        
       // TO save list of data
        
        for(Student stu:studentlist)
        {
            Transaction transaction = session.beginTransaction();
            
            session.persist(stu);
            transaction.commit();
        }
    }
}
