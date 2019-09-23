package Assignments;

import java.util.*;

public class replit137 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
		                              {scan.nextInt(), scan.nextInt(), scan.nextInt()},
		                              {scan.nextInt(), scan.nextInt(), scan.nextInt()}
		                            };
		    int result = 0;
		    
		    for (int i = 0; i < matrix.length; i++) { //outer
				
		    	
					
		    		result = (matrix[0][0]+matrix[1][1]+matrix[2][2])-(matrix[0][2]+matrix[1][1]+matrix[2][0]);
		    		
		    		
				}
		
		    
		    
		    
		    
		    // FINAL PRINT
		    System.out.println(Math.abs(result));
		  
		   // System.out.println(Arrays.toString(matrix));
	
	
	
	}
		}