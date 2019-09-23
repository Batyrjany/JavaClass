package day9;

import java.util.Scanner;

public class warmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan= new Scanner(System.in);	
	
	System.out.println("Welcome to Math Library");
	
	System.out.println("Enter 2 integer:");
	int n1, n2;
	n1 = scan.nextInt();
	n2 = scan.nextInt();
	int sum= n1+n2;
	if(sum>100) {
		System.out.println("You entered");
	}else {
		System.out.println("You suck");
	}
	
		
	}
}
