package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class replit115 {

	public static void main(String[] args) {
		 
		
		Scanner input = new Scanner(System.in);
			
		String[] words = new String[5];
		
		
		int max = 0;
		int index= 0;
		 
		for(int i = 0; i < 5;  i++) {
			
			  words[i] = input.nextLine();
			  
			
		
			//write your code below
	
		
			  
			if(words[i].length()>max) {
				max= words[i].length();
			
			 index=i;
			
			
		}
		
	}
	
	System.out.println(words[index]);
		
	}

}
