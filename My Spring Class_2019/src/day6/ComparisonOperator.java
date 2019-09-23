package day6;

import java.util.Scanner;

public class ComparisonOperator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter number 1: ");
		int num1 = input.nextInt();
		System.out.println(" Enter number 2: ");
		int num2 = input.nextInt();
				
		boolean greaterThan = num1>num2;
		System.out.println(" The number1 is greater than number2 "+ greaterThan);
		
		input.close();
		
		
		
		
		
		
		
		
		
	}

}
