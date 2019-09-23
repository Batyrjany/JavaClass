package day16;

import java.util.Scanner;

public class endsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ask user to enter a name:
				//1. check whether the name starts with A
				//2. get the last index of letter a
				
				//3. with Optional
				// if the name has more than 2 character do these
				//	get the middle letter 
				 // if the name has odd length get single char
				// if the name has even length get both chars
				
				
				Scanner scan = new Scanner (System.in);
				System.out.println("Enter your name:");
				String name = scan.nextLine();
			
				boolean b1 = name.startsWith("A");
				boolean b2 = name.endsWith("x");

				if(b1 && b2) {
					System.out.println("the name matches");
				}else {
					System.out.println("does not match");
				}
				
			System.out.println(name.lastIndexOf("a"));	
		
			int count = name.length();
			if(name.length()>2) {
				if(count%2 == 1) {
					
					
					int midIndex = count/2;
					
					System.out.println(name.charAt(midIndex));
			
				
			}else {
					int midIndex = count/2;
					char midR = name.charAt(midIndex);
					char midL = name.charAt(midIndex-1);
					System.out.println(""+midL+midR);
			}
			}	
	}
	
	}		
