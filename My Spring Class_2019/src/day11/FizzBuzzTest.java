package day11;

import java.util.Scanner;

public class FizzBuzzTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
	/*	
		System.out.println("Enter the number");
		int num = scan.nextInt();
		
		String result;
		
		result=(num%5==0 ||  num%3==00)? "FizzBuzz":"Not FizzBuzz";
		
		System.out.println(result);
	*/
		
		System.out.println("Enter the number");
		int num = scan.nextInt();
		
		String result;
		
		result=(num%15==0)? "FizzBuzz":"Not FizzBuzz";
		
		System.out.println(result);
		
		
		
	}

}
