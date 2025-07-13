package com.practice.ParkingManagementSystem;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.entity.OwnerDetails;
import com.practise.utility.HibernateUtility;

public class SetSingleUser {

	public void setSingleData() {

		// 1.Session Factory
		SessionFactory factory = HibernateUtility.getSessionFactory();

		// 2. Session from Session Factory
		Session session = factory.openSession();

		// 3.Transaction from session //
		 Transaction transaction = session.beginTransaction();

		System.out.println("Enter the user details ");

		OwnerDetails d = new OwnerDetails();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the User ID : ");
		int id = sc.nextInt();
		sc.nextLine();
		d.setId(id);

		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		d.setName(name);

		System.out.println("Enter Flat No :");
		d.setFlatno(sc.nextLine());

		System.out.print("Enter Gender: ");
		d.setGender(sc.nextLine());

		System.out.print("Owner or Tenant: ");
		d.setTenantOrOwner(sc.nextLine());

		System.out.print("Enter Contact: ");
		d.setContact(sc.nextLine());

		System.out.println(d.toString());
		

		// To save sigle Data // 
		//4. save process // 
		session.persist(d);

		// //5. pass to database // 
		transaction.commit();  
		
		
		//6.close session //
	   	session.close();

	}

	public static void main(String[] args) {

		SetSingleUser s = new SetSingleUser();
		s.setSingleData();

	}

}
