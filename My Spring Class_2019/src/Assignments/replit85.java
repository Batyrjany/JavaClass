package Assignments;

import java.util.Scanner;

public class replit85 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    String separator = scan.next();
		    int count = scan.nextInt();
		  
		   
		    	
		    if (count ==1) {
		          System.out.println(word);
		          
		      }else if (count>=2) {
		    	  
		    	  System.out.print(word);
		        
		          for (int x=1 ; count>x; x++ ) {
		            
		              
		         System.out.print(separator+word );
		            
		              
		          }
		      }
		    
	}

}
