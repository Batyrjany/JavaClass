package Assignments;

import java.util.Scanner;

public class replit102 {

	public static void main(String[] args) {
		
		
		//boolean isNumber = Character.isDigit(word.charAt(0)); <-- in this way, we can check if character is digit.
	     //int num = Integer.parseInt(word.substring(0,1)); <-- in this way, we can convert String to int


//		Example of conversion:
//		String word = "1java";
//		boolean isNumber = Character.isDigit(word.charAt(0)); <-- in this way, we can check if character is digit.
//		int num = Integer.parseInt(word.substring(0,1)); <-- in this way, we can convert String to int


	 Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    int sum  = 0;
	    
	
	
	for (int i = 0; i <= str.length()-1; i++) {
	
		boolean isNumber = Character.isDigit(str.charAt(i));
		
		
		if(isNumber==true) {
			
			int num = Integer.parseInt(str.substring(i,i+1));
			
			sum=sum+num;
			
		
		}
	
	
}
	System.out.println(sum);
		
}
	
}