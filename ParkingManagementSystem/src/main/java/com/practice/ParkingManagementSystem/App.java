package com.practice.ParkingManagementSystem;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("Parking Management System !");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice: ");
		
		while (true) {

			System.out.println("Choose an option:" 
					+ "\n1. Add New User" 
					+ "\n2. Display All Users"
					+ "\n3. Search by Flat No" 
					+ "\n4. Exit");

			// *************** Switch Case *************** //

			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {

			case 1:
				SetSingleUser s = new SetSingleUser();
				s.setSingleData();
				break;

			case 2:
				GetUserdata data = new GetUserdata();
				data.getAllUserDetails();
				break;

			case 3:
				GetUserdata Singledata = new GetUserdata();
				Singledata.getSingleUserDetails();
				break;

			case 4:
				System.out.println("Exiting program. Goodbye!");
				System.exit(0); // Terminates the program immediately
				break;
			}

		}

	}
}
