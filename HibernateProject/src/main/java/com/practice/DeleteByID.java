package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practice.Utility.HibernateUtility;
import com.practice.entity.Student;

public class DeleteByID {
	
public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		Student st = session.find(Student.class, 2);
		session.remove(st);
		
		System.out.println(st.toString());
		
		transaction.commit();
		session.close();
		
	}

}
