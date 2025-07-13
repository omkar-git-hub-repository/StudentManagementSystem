package com.practice.ParkingManagementSystem;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.entity.OwnerDetails;
import com.practise.utility.HibernateUtility;

public class GetUserdata {
	
	public void getSingleUserDetails() {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User ID : ");
		int ID = sc.nextInt();
		
		// Get single user details
		OwnerDetails details = session.find(OwnerDetails.class, ID);
		System.out.println(details.toString());
		
		transaction.commit();
		session.close();
		
	}
	
	
	public void getAllUserDetails() {
		
		SessionFactory factory =  HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		// Print all User details 
		
		List<OwnerDetails> ownerlist = session.createQuery("SELECT s FROM OwnerDetails s", OwnerDetails.class).getResultList();
		ownerlist.stream().forEach(k -> System.out.println(k.toString()));
		
		transaction.commit();
		session.close();
	}
	

}
