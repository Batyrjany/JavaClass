package day8;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/*
		 * System.out.println("Enter your score:"); int score = scan.nextInt();
		 * 
		 * if(score>60) { System.out.println("Congratulations! You pass!"); }else {
		 * System.out.println("Unfourtunately you did not pass"); }
		 */
		double iphone = 599.99;
		double ipad = 899.99;
		int phoneCount, tabletCount;

		System.out.println("Enter your quantity of Ipnone you want to buy");
		phoneCount = scan.nextInt();
		System.out.println("Enter your quantity of Ipad you want to buy");
		tabletCount = scan.nextInt();
		System.out.println("Enter your budget");
		int budget = scan.nextInt();
		double total = ((iphone * phoneCount) + (ipad * tabletCount));
		if (total < budget) {
			System.out.println(total+"\n"+"I will buy it");

		} else {
			System.out.println(total+"\n"+"out of budget");
			System.out.println("You need "+(total-budget));

		}

	}

}
