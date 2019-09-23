package Assignments;

import java.util.*;

public class replit135 {

	public static void main(String[] args) {
		

		String[][] chessBoard = new String[8][8];
	    //WRITE YOUR CODE HERE
	    
		
	
		for (int i = 1; i < 9; i++) {
			
			for ( char j = 'a'; j <= 'h'; j++) {
				
				chessBoard[i][j]="" + i + j;
				System.out.println("" + i + j);
				
			}
			
			
			
			
		}
		
		
		
		
		
		
	    //DO NOT CHANGE
	    System.out.println(Arrays.deepToString(chessBoard));
	  }
	}
