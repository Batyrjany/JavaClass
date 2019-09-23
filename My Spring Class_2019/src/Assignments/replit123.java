package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class replit123 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    int zero []= new int[8];
	    
	    
	    //TODO. Write you code below this line. 
	    
	   // System.out.println(Arrays.toString(inhabitants));

	    
	    int day = 0;
	  for (int i = 0; i < inhabitants.length; i++) {	
			

		  
		  day++;
		  
          for (int j = 0; j < inhabitants.length; j++) {
	
	    if(i>0) 
		
		inhabitants[j]=inhabitants[j]/2;
	    
          }
	   System.out.println("Day "+ day+" "+Arrays.toString(inhabitants));
	   if (Arrays.equals(inhabitants, zero))
		break;
          
	  }   
		
	  System.out.println("---- EXTINCT ----");
	  
	
		
		
		
		
		
	}
	
	
}	


	