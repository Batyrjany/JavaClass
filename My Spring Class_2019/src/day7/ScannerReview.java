package day7;

import java.util.Scanner;

public class ScannerReview {

	public static void main(String[] args) {
	
		  
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter your name: ");
	//String name = scan.next();
	String name = scan.nextLine();
	System.out.println("Enter your company name: ");
	//String cname = scan.next();
	String cname = scan.nextLine();
	System.out.println("Hello Fellow coder "+ name+" i work at "+ cname);
	

		
	
	
	}

}
