package Assignments;

import java.util.Scanner;
public class replit87 {

	public static void main(String[] args) {


		Scanner scan= new Scanner(System.in);
	    String word = scan.next();
	    int count=0;
	    int l = word.length();
	    String sub = word.substring(0, l-1);
	   
	    
	    for(int i = 0; i<l-3;i++) {
	    if(word.substring(i,i+4).equalsIgnoreCase("java"))
	    	count++;
	    
	    
	    }
	    
	    
	    System.out.println(count);
	}

}

