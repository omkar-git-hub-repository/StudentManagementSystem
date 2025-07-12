package com.practice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practice.Utility.HibernateUtility;
import com.practice.entity.Student;

public class GetAllDetails {
	
	public static void main(String[] args) {
		
		SessionFactory factory =  HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		List<Student> studentlist = session.createQuery("SELECT s FROM Student s", Student.class).getResultList();
		
		studentlist.stream().forEach(k -> System.out.println(k.toString()));
		
		transaction.commit();
		session.close();
		
		
		
	}

}
