package day10;

import java.util.Scanner;

public class ConditionalIfOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);

		
		System.out.println("Welcome to Okta to Slack");
		System.out.println("Enter user name length");
		
		
		int lengthOfName= scan.nextInt();
		if(lengthOfName>22) {
			System.out.println("Slack can not take more than 22 char");
			lengthOfName =21;
			System.out.println("user name has been adjusted");
		}
System.out.println("Successfuly added user");		
		
	}

}
