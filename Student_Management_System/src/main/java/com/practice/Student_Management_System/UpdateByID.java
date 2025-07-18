package com.practice.Student_Management_System;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import student.Utility.StudentHibernateUtility;
import student.entity.Students;

public class UpdateByID {

	public void updateByID() {

		// 1. Session Factory
		SessionFactory factory = StudentHibernateUtility.getSessionFactory();

		// 2. Session From Session Factory
		Session session = factory.openSession();

		// 3. Transaction from session
		Transaction transaction = session.beginTransaction();
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id to update : ");
		int StudentIdUserInput = sc.nextInt();
				
		Students st = session.find(Students.class, StudentIdUserInput);
		
		Students s = new Students();
		
		System.out.println("Enter Student ID :");
		s.setId(sc.nextInt());
		sc.nextLine();  // To avoid continuos input from console
		
		System.out.println("Enter Student Name : ");
		s.setName(sc.nextLine());
		
		System.out.println("Enter Student Email : ");
		s.setEmail(sc.nextLine());
		
		System.out.println("Enter Student Course : ");
		s.setCourse(sc.nextLine());
		
		System.out.println("Enter Marks : ");
		s.setMarks(sc.nextInt());
		
		System.out.println("Details Updated Successfully : " + s.toString());
		
		transaction.commit();
		
		session.close();
		
		
	}

}
