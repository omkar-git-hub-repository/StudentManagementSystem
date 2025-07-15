package com.practice.Student_Management_System;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import student.Utility.StudentHibernateUtility;
import student.entity.Students;

public class DeleteByID {

	public void deleteStudentData() {

		// 1. Session Factory
		SessionFactory factory = StudentHibernateUtility.getSessionFactory();

		// 2. Session From Session Factory
		Session session = factory.openSession();

		// 3. Transaction from session
		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id to Delete : ");
		int StudentIdUserInput = sc.nextInt();

		Students st = session.find(Students.class, StudentIdUserInput);
		session.remove(st);
		
		transaction.commit();
		
		session.close();
		

	}

}
