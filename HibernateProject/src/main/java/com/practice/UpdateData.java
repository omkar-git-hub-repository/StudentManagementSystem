package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practice.Utility.HibernateUtility;
import com.practice.entity.Student;

public class UpdateData {
	
	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		//fetching the data
		Student s =  session.find(Student.class, 3);
		s.setfName("Suyash");
		s.setCity("Bengluru");
		s.setCource("Java");
		
		
		
		
		transaction.commit();
		session.close();
		
	}

}
