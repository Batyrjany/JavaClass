package day18;

import java.util.Scanner;

public class WhileLoopMultipleCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  scan = new Scanner(System.in);
		
		
		System.out.println("Enter your number:");
		
		
		int num = scan.nextInt();
		int count = 1;
		while (count<=num) {
			System.out.print(count+", ");
			count++;
		}
		
		
		System.out.println();//will stay on the same line

		
		System.out.println("The end");//will start from new line
		System.out.println("The end");//will start from new line

	}

}
