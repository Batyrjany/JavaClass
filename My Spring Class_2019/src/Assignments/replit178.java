package Assignments;

import java.util.Scanner;

public class replit178 {

	public static void main(String[] args) {
	
		
		//Scanner scan =new Scanner(System.in);
		  // String str = scan.next();
		String input="public";
		   
		
		System.out.println(reverse(input));
		 
		} 
	
	
	public static String reverse(String input)
	{
		
		//input="public";
		   
		String reverse = "";
		
		   for(int i = input.length()-1; i>=0 ; i--){
		     
		     reverse+=input.charAt(i)+"";
		     
		     
		   }
		   
		  // System.out.println(reverse); 
		return reverse;
	}
	}