package com.practice.Student_Management_System;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import student.Utility.StudentHibernateUtility;
import student.entity.Students;

public class GetAllStudentDetails {

	public void getAllStudentDetails() {

		// 1. Session Factory
		SessionFactory factory = StudentHibernateUtility.getSessionFactory();

		// 2. Session From Session Factory
		Session session = factory.openSession();

		// 3. Transaction from session
		Transaction transaction = session.beginTransaction();
		
		List<Students> studentlist = session.createQuery("SELECT s FROM Students s", Students.class).getResultList();
		studentlist.stream().forEach(k -> System.out.println(k.toString()));

		transaction.commit();
		session.close();
	}

}
