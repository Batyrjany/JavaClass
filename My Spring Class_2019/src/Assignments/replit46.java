package Assignments;

import java.util.Scanner;

public class replit46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char response = 'a';
		// WRITE YOUR CODE HERE
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter command:");

		response= scan.next().charAt(0);

		switch (response) {
		case 'y':
			System.out.println("Your request is being processed");
			break;
		case 'n':
			System.out.println("Thank you anyway for your consideration");
			break;
		case 'h':
			System.out.println("Sorry, no help is currently available");
			break;
		default:
			System.out.println("Invalid entry, please try again!");
			break;
		}
		
		
		
		
		scan.close();
	}

}
