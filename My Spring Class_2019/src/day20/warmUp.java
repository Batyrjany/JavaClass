package day20;

import java.util.Scanner;

public class warmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String name = "";
		String pass = "";
		
		
		while (!(name.contentEquals("abc") && pass.contentEquals("123"))) {
			
			System.out.println("Enter username : ");
			name=scan.next();
			System.out.println("Enter password : ");
			pass=scan.next();
			
		}
		   System.out.println("END");
		
		
		
		
//		   String name = "abc";
//			String pass = "123";
//		
		
//		do {
//			
//			System.out.println("Enter username : ");
//			name=scan.next();
//			System.out.println("Enter password : ");
//			pass=scan.next();
//			
//		}while(!(name.contentEquals("abc") && pass.contentEquals("123")));
//		
		//System.out.println("END");
	}

}
