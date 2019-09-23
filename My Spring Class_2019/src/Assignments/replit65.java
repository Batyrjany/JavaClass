package Assignments;

import java.util.Scanner;

public class replit65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //WRITE YOUR CODE HERE
	    
	    char w1=word1.charAt(word1.length()-1);
	    char w2=word2.charAt(0);
	    int count = word2.length();
	    if (w1==w2){
	      System.out.println(""+ word1+word2.substring(1,count));
			
	    }else {
	    	System.out.println(word1+""+word2);
	    }
	    
	
	    scan.close();
		
	}
}
