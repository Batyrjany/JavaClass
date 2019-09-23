package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class replit121 {

	private static int index;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String reversed = "";
	    //TODO: start your code here
	    
	    
	    

	    
	    
	    String[] str =sentence.split(" ");

	    String rev="";
		
	    int indexO = 0;
	    
	   
	    
		for (int i =str.length-1; i>=0; i--) {
			
	
			//System.out.println(str[i]);
			
			rev += str[i]+" ";
			
			//reversed += str[i]+" ";
			
			indexO = rev.lastIndexOf(" ");
		  
		  
			
			
			reversed = rev.trim();
		   // System.out.println(reversed);
//		 
//		 int indexO = str.lastIndexOf("O");
//			String part = str.substring(indexO+1);
//			
//			
//			System.out.println(part);// with spaces
//			System.out.println(part.trim());// trimmed out of spaces
//
//			System.out.println(str.substring(indexO+1)   );// with spaces
//			System.out.println(str.substring(indexO+1).trim()   );// trimmed out of spaces
//
//		 
		 
			
		}
	    
	    
	    //End your code here. do not modify below statement
	    System.out.println(reversed);
	    
		
		
		
	}

}
