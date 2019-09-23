package day19;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// IN ORDER TO REVERSE STRING WE CAN
		// START GETTING CHARS IN REVERSED ORDER BY USING CHARAT METHOD
		// SINCE THE ORDER IS DECREMENTING, WE USE --
		//IN ORDER TO SAVE REVERSED WORD WE NEED A CONTAINER 
		//WHILE WE ARE LOOPNG THROUGH EACH CHARS
		//CONCANTENATE THEIS CHARACTER TO THE VARIABLE VALUE
		//AFTER THE LOOP WE WILL HAVE THE WORD STORED IN REVERSED ORDER

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String  name =scan.nextLine();;
		
		int count = name.length();
		
		String reversed="";
		
		
		while (count>0) {
			
			System.out.println("REVERSED VARIABLE BEFORE "+reversed);
			
			
			count--;
			
			//System.out.print(name.charAt(count)+" ");
		
		reversed= reversed+name.charAt(count);
		
		   System.out.println("REVERSED VARIABLE AFTER "+reversed);
		
		}
			System.out.println("PALINDROME "+name.equals(reversed));
		
	}

}
