package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class replit147 {

	public static void main(String[] args) {
		
		
		//Create a method called next3 .
		//This method gets an int argument and 
		//prints the next 3 numbers after that number.
		//Call the method from main method and pass num to it.

		
		
		 Scanner inp = new Scanner(System.in);
	     System.out.print("enter number");
	     int num = inp.nextInt();
	     
	 next3(num);
	     
			
	}
	
	
	public static void next3(int nums) {
		
		
		if(nums>0) {
			int n1=nums+1;
			int n2=nums+2;
			int n3=nums+3;
		
		System.out.println(n1+" "+n2+" "+n3);
		}
		
	}
	
	
}
