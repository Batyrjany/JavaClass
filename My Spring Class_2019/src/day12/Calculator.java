package day12;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("Enter operators +, -, *, / ");
		String operator =scan.next();
//		
//		if (operator.equals("+")) {
//			System.out.println("the result is "+(num1+num2));
//		} else if(operator.equals("-")) {
//			System.out.println("the result is "+(num1-num2));
//			
//		}else if(operator.equals("*")) {
//			System.out.println("the result is "+(num1*num2));
//			
//		}else if(operator.equals("/")) {
//			System.out.println("the result is "+(num1/num2));
//			
//		}else {
//				System.out.println("invali operator");
//		}
		
		
		switch (operator) {
		case "+":
			System.out.println("the result is "+(num1+num2));
		break;
		case"-":
			System.out.println("the result is "+(num1-num2));
		break;
		case"*":
			System.out.println("the result is "+(num1*num2));
		break;
		case"/":
			System.out.println("the result is "+(num1/num2));
		break;
		default:
			System.out.println("invalid operator");
		}
		
		
		
//	System.out.println((operator.equals("+"))?(num1+num2):
//		(operator.equals("-"))?(num1-num2):
//			(operator.equals("*"))?(num1*num2):
//				(operator.equals("/"))?(num1/num2):("invalid operator"));
//		
//			
		
		
				 
		
		scan.close();
		
		
	}

}
