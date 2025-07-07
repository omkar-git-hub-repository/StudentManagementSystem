package libraryMain;

import java.util.Scanner;

import adminPanel.AdminSection;

public class Library_Main {

	public static void main(String[] args) throws InterruptedException {
		// 1. Display a welcome message
		System.out.println("╔══════════════════════════════════════════════════════════════╗");
		System.out.println("║                                                              ║");
		System.out.println("║              Welcome to the Library Management System        ║");
		System.out.println("║                     --------------------------               ║");
		System.out.println("╚══════════════════════════════════════════════════════════════╝");



		// Create a Scanner object to read user input
		Scanner scanner = new Scanner(System.in);

		// Loop to keep the menu running until the user chooses to exit
		while (true) {
			// 2. Present the main menu
			System.out.println("--- Main Menu ---");
			System.out.println("1. Admin Login");
			System.out.println("2. Student Panel");
			System.out.println("3. Exit");
			System.out.print("Please enter your choice: ");

			// Read the user's choice
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character left by nextInt()

			// Process the user's choice
			switch (choice) {
			case 1:
				System.out.println("\n-> Loading Admin Panel...");
				Thread.sleep(3000);
				
				// Calling admin section method
				AdminSection a = new AdminSection();
				a.Authentication();
				
				
				break;
			case 2:
				System.out.println("\n-> Loading Student Panel...");
				// TODO: Add call to student panel method here
				System.out.println();
				break;
			case 3:
				System.out.println("\nThank you for using the Library Management System. Goodbye!");
				scanner.close(); // Close the scanner
				System.exit(0); // Exit the application
				break;
			default:
				System.out.println("\nInvalid choice. Please enter a number between 1, 2 and 3.\n");
			}
		}
	}

}
