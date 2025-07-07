package adminPanel;

import java.util.Scanner;

import library_books.SetBookDetails;

public class AdminSection extends SetBookDetails {

	private String UserName = "Admin";
	private String Password = "Admin@123";

	public void Authentication() {

		Scanner sc = new Scanner(System.in);

		int count = 3;
		while (count > 0) {

			System.out.println("Enter Admin UserName :");
			String uName = sc.next();

			System.out.println("Enter Admin Password");
			String pwd = sc.next();

			if (uName.equals(UserName) && pwd.equals(Password)) {
				System.out.println("---------- Welcome to Admin Panel -------");

				System.out.println("Enter : 1. To List All the Books");
				System.out.println("Enter : 2. To List All Student data");
				System.out.println("Enter : 3. To Exit");

				int getChoise = sc.nextInt();

				if (getChoise == 1 || getChoise == 2 || getChoise == 3) {

					switch (getChoise) {
					case 1:
						SetBookDetails sd = new SetBookDetails();
						sd.DisplayAllBookDetails();
						break;

					case 2:
						System.out.println("All students");
						break;

					case 3:
						System.out.println("\nThank you for using the Library Management System. Goodbye!");
						System.exit(0);
						break;

					default:
						System.out.println("Enter 1 or 2");
					}
				} else {
					System.out.println("Enter valid input 1 or 2");
				}
				break;
			}

			else {
				System.out.println("UserName or Password is Wrong.");
			}
			count--;
			System.out.println("Attemp left : " + count + "\n");
			continue;
		}

		if (count == 0) {
			System.err.println("\nToo many Attemps try again after 59.sec");
		}

	}

//	public static void main(String[] args) {
//
//		AdminSection a = new AdminSection();
//
//		a.Authentication();
//
//	}

}
