package day20;

import java.util.Scanner;

public class BreakStatement {

	public static void main(String[] args) {

		
		//break statement is u=sed to break out switch statement
		// and loops
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please put a number:");
		int number = input.nextInt();
		int sum = 0;
	//while loop	
//		while (number > 0) {
//			sum += number;
//			number--;
//			// System.out.println();//one by one
//			if (sum > 40) {
//				System.out.println("You reach the limit!");
//				System.out.println("your sum is: " + sum);
//				break;
//			}
//		}
		
	// do while
		do {
			sum += number;
			number--;
			// System.out.println();//one by one
			if (sum > 40) {
				System.out.println("You reach the limit!");
				System.out.println("your sum is: " + sum);
				break;
			}
			
		} while (number > 0);
		System.out.println("The sum of numbers from 1 to selected number" + " = " + sum);
		
	}

}
