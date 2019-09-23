package day11;

import java.util.Scanner;

public class singleStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		//int x = 100;
		
int x = scan.nextInt();


		// if there is no curly braces the first line will be on conlsole

		//if (x > 100)
		//	System.out.println("More than 100");
		//System.out.println("something else");
	
	
	// &&, &, ||, |, !
	
	
	//if (x>100 && ++x<200) {
		//System.out.println("both are true");
	//}
	
	//	if (x>100 & ++x<200) {
	//		System.out.println("both are true");
	//	}
	
	//	if (x==100 || ++x<200) {
	//		System.out.println("both are true");
	//	}
		
		
		if (x==100 | ++x<200) {
			System.out.println("both are true");
		}
	
	
	
	}

}
