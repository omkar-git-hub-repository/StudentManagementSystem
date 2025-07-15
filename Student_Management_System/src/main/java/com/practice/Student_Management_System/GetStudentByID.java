package com.practice.Student_Management_System;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import student.Utility.StudentHibernateUtility;
import student.entity.Students;

public class GetStudentByID {

	public void getByID() {

		// 1. Session Factory
		SessionFactory factory = StudentHibernateUtility.getSessionFactory();

		// 2. Session From Session Factory
		Session session = factory.openSession();

		// 3. Transaction from session
		Transaction transaction = session.beginTransaction();

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id : ");
		int id = sc.nextInt();
		
		
		Students st = session.find(Students.class, id);
		
		System.out.println(st.toString());
		
		
		
		// 4. Save process
		//session.persist(s);

		// 5. pass to database
		transaction.commit();

		// 6.close session
		session.close();

	}

}
