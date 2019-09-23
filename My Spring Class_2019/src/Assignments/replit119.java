package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class replit119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
	    
	    int decimal = input.nextInt();
	    
	    
	    int[] binary = new int[8];
	    
	    
	    
	   
	    //TODO: Write your code below.
	    
		//System.out.println(Arrays.toString(binary));
	 
	    
	    int i=7;
	    
	    while(decimal>0){
	      
	    	binary[i--]=decimal%2;
	      
	    	decimal/=2;
	    
	    }System.out.println(Arrays.toString(binary));

	  }
	    
	    
	    
	}


