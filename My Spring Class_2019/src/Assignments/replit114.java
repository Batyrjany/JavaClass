package Assignments;

import java.util.Scanner;

public class replit114 {

	public static void main(String[] args) {
		

		  Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO Type your code below:
		    
		    boolean b = true;
		    
		for (int i = 0; i < nums.length; i++) {
			
			
			
			if(nums[i]==5 && nums[i]==nums[i+1]) {
			
				b = true;
				break;
			}else {
				b = false;
			
			}
			
			
		}
		
		System.out.println(b);
	}

}
