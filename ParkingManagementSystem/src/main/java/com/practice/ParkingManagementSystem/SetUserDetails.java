package com.practice.ParkingManagementSystem;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.entity.OwnerDetails;
import com.practise.utility.HibernateUtility;

public class SetUserDetails {

	public static void main(String[] args) {

		// In this we will set multiple user details as well det details from the input

		OwnerDetails details1 = new OwnerDetails();
		details1.setId(102);
		details1.setName("Aarav Mehta");
		details1.setFlatno("A-101");
		details1.setGender("Male");
		details1.setTenantOrOwner("Owner");
		details1.setContact("9876543210");
		System.out.println(details1.toString());

		OwnerDetails details2 = new OwnerDetails();
		details2.setId(103);
		details2.setName("Priya Sharma");
		details2.setFlatno("B-203");
		details2.setGender("Female");
		details2.setTenantOrOwner("Tenant");
		details2.setContact("8765432109");
		System.out.println(details2.toString());

		OwnerDetails details3 = new OwnerDetails();
		details3.setId(104);
		details3.setName("Rohan Desai");
		details3.setFlatno("C-104");
		details3.setGender("Male");
		details3.setTenantOrOwner("Owner");
		details3.setContact("9988776655");
		System.out.println(details3.toString());

		OwnerDetails details4 = new OwnerDetails();
		details4.setId(105);
		details4.setName("Nisha Kulkarni");
		details4.setFlatno("A-305");
		details4.setGender("Female");
		details4.setTenantOrOwner("Tenant");
		details4.setContact("9123456780");
		System.out.println(details4.toString());

		OwnerDetails details5 = new OwnerDetails();
		details5.setId(106);
		details5.setName("Aditya Joshi");
		details5.setFlatno("D-106");
		details5.setGender("Male");
		details5.setTenantOrOwner("Owner");
		details5.setContact("9001122334");
		System.out.println(details5.toString());
		
		
		// 1.Session Factory
		SessionFactory factory = HibernateUtility.getSessionFactory();

		// 2. Session from Session Factory
		Session session = factory.openSession();

		// 3.Transaction from session //
		//Transaction transaction = session.beginTransaction();

		// save multiple data at once
		List<OwnerDetails> ownerlist = Arrays.asList(details1, details2, details3, details4, details5);

		for (OwnerDetails d : ownerlist) {

			Transaction transaction = session.beginTransaction();
			session.persist(d);
			transaction.commit();
		}

		// To save sigle Data // //4. save process // session.persist(details);

		// //5. pass to database // 
		
	   //	transaction.commit();  
		
		//6.close session //
		session.close();

	}

}
