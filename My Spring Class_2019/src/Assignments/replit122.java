package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class replit122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i =0 ;i<=rows-1;i++)
	    {
	      for(int j=0 ;j<=cols-1;j++)
	      {
	        arr[i][j]=inp.nextInt();

	      }//end for cols
	    }//end for rows
	    
	  
	    
		    
		    //TODO write your code below
		    
		    
	    
	    int max = arr [0][0];
	    
	    for (int i = 0; i <=rows-1; i++) {
			
	    	
	    	for (int j = 0; j <=cols-1; j++) {
				
	    		if (arr[i][j]>max) {
	    			max=arr[i][j];
	    		}
	    			
	    		
	    		
			}
	    	
	    	}
	          
	    
		    
		    
		  System.out.println(max);   
		   
		
		
	}

}
