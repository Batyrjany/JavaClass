package day18;

import java.util.Scanner;

public class giveMeSum {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num = scan.nextInt();
		
		int x = 1;
		int sum =0;
		
		while (x<=num) {
		
			sum += x; 
			
			System.out.println("sum is " +sum + " count is "+ x);
			++x;
		}
		System.out.println(x);
		
		
	}

}
