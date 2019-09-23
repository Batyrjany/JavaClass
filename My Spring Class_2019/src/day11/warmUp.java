package day11;

import java.util.Scanner;

public class warmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
System.out.println("Print a number:");
int num = scan.nextInt();
	if (num%5 == 0 && num%3==0) {
		System.out.println("fizz buzz");
		
	}else if (num%5 == 0) {
		System.out.println("FIZZ");	
			
		}else if (num%3==0) {
			System.out.println("BUZZ");
		}else {
			System.out.println("NOT a fizz buzz number");
		}
	}

}
