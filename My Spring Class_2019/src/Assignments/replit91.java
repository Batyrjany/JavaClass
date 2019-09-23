package Assignments;

import java.util.Scanner;

public class replit91 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    word = word.toLowerCase().replace(" ", "");
	    //WRITE YOUR CODE HERE
	    
	    int count=word.length();
	    
	    
	    
	    String reversed = "";
	  	
	    	
	   
	    	
	    	for (int i =word.length()-1; i>=0; i--) {
	    		
	    		reversed += word.charAt(i);
	    	
	    		
	    		
	    	}
	    	
	    	
	    	
	    	if(word.equalsIgnoreCase(reversed)) {
	    		
	    		System.out.println("true");
	    			
	    		}else {
	    			System.out.println("false");
	    	}
	    	
	    	
	    	
	    	
	    }
	    
	    	
	    	
	    	
	}


