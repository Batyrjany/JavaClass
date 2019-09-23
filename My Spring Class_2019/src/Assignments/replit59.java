package Assignments;

import java.util.Scanner;

public class replit59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	  
//	    
 char firstLetter = (word.charAt(0));
char lastLetter = (word.charAt(word.length()-1));

	 
	 
	System.out.println(firstLetter+""+lastLetter);    
	    
	//System.out.println(word.charAt(word.length()-1));    
	 scan.close();
		
		
	}

}
