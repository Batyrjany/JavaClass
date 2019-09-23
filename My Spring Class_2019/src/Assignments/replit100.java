package Assignments;

import java.util.Scanner;

public class replit100 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    int prize = 0;
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		    int d = scan.nextInt();
		    
		    
		    

		    int [] nums= {a,b,c,d};
			 int   count = 0;
			 for (int x = 0; x < nums.length; x++) {
		      

		         for (int y = 0; y < nums.length; y++) {

		             if (nums[x] == nums[y])
		                 count++;

		         }

		         if (count > 1)
		             prize = (count - 1) * 10;
		     }

		     System.out.println(prize);}}