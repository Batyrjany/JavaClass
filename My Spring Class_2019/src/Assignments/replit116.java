package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class replit116 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    //type your code below

	    
	    String newStr[] = sentence.split(" ");
	   // System.out.println(Arrays.toString(newStr));
	    
	   
	    
	    for (int i = 0; i < newStr.length; i++) {
	    	 System.out.println(newStr[i]);
	    	
		}
	   
	}

}
