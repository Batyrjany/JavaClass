package Assignments;

import java.util.Scanner;

public class replit101 {

	public static void main(String[] args) {
	
		
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();
		
		int len = str.length();
		String sub = str.substring(len-n, len);
		
		for (int i = 0; i < n; i++) {
		
			System.out.print(sub);
			
			
		}
  }
}