package Assignments;

import java.util.Scanner;

public class replit86 {

	public static void main(String[] args) {


		 Scanner scan = new Scanner(System.in);
		    String str = scan.next();
		    int n = scan.nextInt();
		    
		    System.out.println( ( str.substring(n,str.length() ).contains(  str.substring(0, 0+n))    ));
		      
		    
		
	}

}
