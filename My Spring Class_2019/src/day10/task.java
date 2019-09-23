package day10;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Amazon");
		System.out.println("What is the price in your cart");
		double price = scan.nextDouble();
		System.out.println("Are you a prime member");
		boolean isPrimeMember = scan.nextBoolean();
		
		if (isPrimeMember) {
			System.out.println("YOU GOT FREE SHIPPING:"+ price);
		} else if (price>35) {
			System.out.println("YOU STILL GOT FREE SHIPPING "+price);
		} else {
			//price +=5;
			//System.out.println("YOU GOT TO PAY 5$ shipping "+ price);
			System.out.println("YOU GOT TO PAY 5$ shipping "+ (price+5));
			
			
			System.out.println("You may also consider joining and avoid shipping fee");
			
		}
		
		
		
		
	}

}
