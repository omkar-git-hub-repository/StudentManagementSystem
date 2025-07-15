package com.practice.Student_Management_System;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Student Management System !");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice: ");

		while (true) {

			System.out.println("Choose an option:" 
			+ "\n1. Add New Student" 
					+ "\n2. Display All Student"
					+ "\n3. Search by Student ID" 
					+ "\n4. Update Student " 
					+ "\n5. Delete Student " 

					+ "\n6. Exit");

			// *************** Switch Case *************** //

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1 :

				//Students s = new Students();
				AddStudent as = new AddStudent();
				as.addStudent();
				break;
				
			case 2 :
				GetAllStudentDetails allStudent = new GetAllStudentDetails();
				allStudent.getAllStudentDetails();
				break;
				
			case 3 :
				  GetStudentByID getid = new GetStudentByID();
				  getid.getByID();
				  
			case 4 :
				UpdateByID update = new UpdateByID();
				update.updateByID();
				
			case 5 : 
				DeleteByID d = new DeleteByID();
				d.deleteStudentData();
			
			case 6 :
				System.out.println("Existing..Goodbye...!");
				System.exit(0);
			
			default :
				System.out.println("Enter a valid choise ");

			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
